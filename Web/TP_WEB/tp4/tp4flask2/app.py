#! /usr/bin/python
# -*- coding:utf-8 -*-
from flask import Flask, request, render_template, redirect, flash, session, g
import pymysql.cursors

app = Flask(__name__)
app.config["TEMPLATES_AUTO_RELOAD"] = True
app.secret_key = 'une cle(token) : grain de sel(any random string)'


def get_db():
    if 'db' not in g:
        g.db = pymysql.connect(
            host="serveurmysql.iut-bm.univ-fcomte.fr",
            user="nfaouz",
            password="secret",  # <-- Mets ton mot de passe MySQL ici
            database="BDD_nfaouz",
            charset='utf8mb4',
            cursorclass=pymysql.cursors.DictCursor
        )
    return g.db


@app.teardown_appcontext
def teardown_db(exception):
    db = g.pop('db', None)
    if db is not None:
        db.close()


@app.route('/')
@app.route('/etudiant/show')
def show_etudiant():
    mycursor = get_db().cursor()
    sql = '''
        SELECT etudiant.id_etudiant AS id,
               etudiant.nom_etudiant AS nom,
               etudiant.groupe_etudiant_id AS groupe_id,
               groupe.libelle_groupe AS libelle
        FROM etudiant
        INNER JOIN groupe ON groupe.id_groupe = etudiant.groupe_etudiant_id
        ORDER BY etudiant.nom_etudiant;
    '''
    mycursor.execute(sql)
    etudiants = mycursor.fetchall()
    return render_template('etudiant/show_etudiant.html', etudiants=etudiants)


@app.route('/etudiant/add')
def add_etudiant():
    mycursor = get_db().cursor()
    sql = '''SELECT id_groupe AS id, libelle_groupe AS libelle
             FROM groupe
             ORDER BY libelle_groupe;'''
    mycursor.execute(sql)
    groupes = mycursor.fetchall()
    return render_template('etudiant/add_etudiant.html', groupes=groupes)


@app.route('/etudiant/add', methods=['POST'])
def valid_add_etudiant():
    nom = request.form.get('nom')
    groupe_id = request.form.get('groupe_id')

    mycursor = get_db().cursor()
    sql = '''INSERT INTO etudiant(id_etudiant, nom_etudiant, groupe_etudiant_id)
             VALUES (NULL, %s, %s);'''
    tuple_param = (nom, groupe_id)
    mycursor.execute(sql, tuple_param)
    get_db().commit()

    flash(f'Ajout étudiant : nom={nom}, groupe_id={groupe_id}', 'alert-success')
    return redirect('/etudiant/show')


@app.route('/etudiant/delete')
def delete_etudiant():
    id_etudiant = request.args.get('id')

    mycursor = get_db().cursor()
    sql = '''DELETE FROM etudiant WHERE id_etudiant = %s;'''
    tuple_param = (id_etudiant,)
    mycursor.execute(sql, tuple_param)
    get_db().commit()

    flash(f'Suppression étudiant : id={id_etudiant}', 'alert-warning')
    return redirect('/etudiant/show')


@app.route('/etudiant/edit')
def edit_etudiant():
    id_etudiant = request.args.get('id')
    mycursor = get_db().cursor()

    sql = '''SELECT id_etudiant AS id, nom_etudiant AS nom, groupe_etudiant_id AS groupe_id
             FROM etudiant
             WHERE id_etudiant = %s;'''
    mycursor.execute(sql, (id_etudiant,))
    etudiant = mycursor.fetchone()

    sql_groupes = '''SELECT id_groupe AS id, libelle_groupe AS libelle
                     FROM groupe
                     ORDER BY libelle_groupe;'''
    mycursor.execute(sql_groupes)
    groupes = mycursor.fetchall()

    return render_template('etudiant/edit_etudiant.html', etudiant=etudiant, groupes=groupes)


@app.route('/etudiant/edit', methods=['POST'])
def valid_edit_etudiant():
    id_etudiant = request.form.get('id')
    nom = request.form.get('nom')
    groupe_id = request.form.get('groupe_id')

    mycursor = get_db().cursor()
    sql = '''UPDATE etudiant
             SET nom_etudiant = %s,
                 groupe_etudiant_id = %s
             WHERE id_etudiant = %s;'''
    tuple_param = (nom, groupe_id, id_etudiant)
    mycursor.execute(sql, tuple_param)
    get_db().commit()

    flash(f'Modification étudiant : id={id_etudiant}, nom={nom}, groupe_id={groupe_id}', 'alert-success')
    return redirect('/etudiant/show')


if __name__ == '__main__':
    app.run(debug=True)