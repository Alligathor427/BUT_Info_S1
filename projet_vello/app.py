from flask import Flask, request, render_template, redirect, flash
import datetime

from pip._internal.commands import show

app = Flask(__name__)
app.secret_key = 'une cle(token) : grain de sel(any random string)'
app.config["TEMPLATES_AUTO_RELOAD"] = True

# 1 table  typepneuVelo

typePneuVelo = [profiles_settings.xml
    {'id': 1, 'libelleType': 'Ville'},
    {'id': 2, 'libelleType': 'VTT'},
    {'id': 3, 'libelleType': 'Route'},
    {'id': 4, 'libelleType': 'Vélo électrique'},
    {'id': 5, 'libelleType': 'Enfant'}
]

# 2 table  pneuVelo
pneuVelo = [
    {'id': 1, 'nomPneu': 'Pneu velo Confort Michelin', 'fabricant': 'Michelin', 'modelePneu': 'Pneu Michelin blanc et noir', 'largeurPneu': 3, 'diametreJante': 65, 'dimension': '22 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 1, 'prixPneu': 22.00, 'image': 'pneu_michelin_blanc_noir.png'},
    {'id': 2, 'nomPneu': 'Pneu VTT Crossmax', 'fabricant': 'Mavic', 'modelePneu': 'Crossmax Pro', 'largeurPneu': 2.4, 'diametreJante': 60, 'dimension': '29 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 2, 'prixPneu': 55.00, 'image': 'pneu_VTT_crossmax.png'},
    {'id': 3, 'nomPneu': 'Pneu ville CityTouring', 'fabricant': 'Continental', 'modelePneu': 'TourRide', 'largeurPneu': 3, 'diametreJante': 62, 'dimension': '28 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 1, 'prixPneu': 35.58, 'image': 'pneu_ville_touring.png'},
    {'id': 4, 'nomPneu': 'Pneu Route Ultrasport', 'fabricant': 'Schwalbe', 'modelePneu': 'Ultrasport', 'largeurPneu': 2, 'diametreJante': 70, 'dimension': '28 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 3, 'prixPneu': 28.00, 'image': 'pneu_ultrasport.png'},
    {'id': 5, 'nomPneu': 'Pneu Cars', 'fabricant': 'Michelin', 'modelePneu': 'Mich&Flash', 'largeurPneu': 1.3, 'diametreJante': 15, 'dimension': '16 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 5, 'prixPneu': 15.00, 'image': 'pneu_cars.png'},
    {'id': 6, 'nomPneu': 'Pneu Big Ben', 'fabricant': 'Schwalbe', 'modelePneu': 'Ballon', 'largeurPneu': 2.3, 'diametreJante': 30, 'dimension': '26 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 4, 'prixPneu': 20.00, 'image': 'pneu_big_ben.png'},
    {'id': 7, 'nomPneu': 'Pneu Energy', 'fabricant': 'Michelin', 'modelePneu': 'ElectrikRide', 'largeurPneu': 3, 'diametreJante': 35, 'dimension': '29 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 4, 'prixPneu': 22.64, 'image': 'pneu_energy.png'},
    {'id': 8, 'nomPneu': 'Pneu Touring Marathon', 'fabricant': 'Schwalbe', 'modelePneu': 'Touring', 'largeurPneu': 5, 'diametreJante': 55, 'dimension': '26 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 3, 'prixPneu': 60.00, 'image': 'pneu_touring_marathon.png'},
    {'id': 9, 'nomPneu': 'Pneu VTT Ikon', 'fabricant': 'Maxxis', 'modelePneu': 'EXO', 'largeurPneu': 7, 'diametreJante': 63, 'dimension': '29 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 2, 'prixPneu': 33.99, 'image': 'pneu_VTT_Ikon.png'},
    {'id': 10, 'nomPneu': 'Pneu Route Corsa', 'fabricant': 'Veloflex', 'modelePneu': 'Corsa Evo', 'largeurPneu': 2, 'diametreJante': 75, 'dimension': '25 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 3, 'prixPneu': 49.26, 'image': 'pneu_route_corsa.png'},
    {'id': 11, 'nomPneu': 'Pneu velo Zig Zag', 'fabricant': 'Oxford', 'modelePneu': 'Noir traditionnel', 'largeurPneu': 3.2, 'diametreJante': 58, 'dimension': '26 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 1, 'prixPneu': 10.00, 'image': 'pneu_velo_zig_zag.png'},
    {'id': 12, 'nomPneu': 'Pneu Kid Road', 'fabricant': 'Bike Original', 'modelePneu': 'RoadTown', 'largeurPneu': 1.5, 'diametreJante': 18, 'dimension': '18 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 5, 'prixPneu': 12.00, 'image': 'pneu_kid_road.png'},
    {'id': 13, 'nomPneu': 'Pneu VTT Syerra', 'fabricant': 'Vittoria', 'modelePneu': 'TLR G2', 'largeurPneu': 3, 'diametreJante': 46, 'dimension': '27 pouces', 'dateCreation': '2023-02-02', 'typePneu_id': 2, 'prixPneu': 44.99, 'image': 'pneu_VTT_syerra.png'}
]

# page de base
@app.route('/')

# petite table
@app.route('/type-pneu-velo/show')
def show_type_pneu_velo():
    return render_template('type_pneu_velo/show_type_pneu_velo.html', types=typePneuVelo)

# grande table
@app.route('/pneu-velo/show')
def show_pneu_velo():
    return render_template('pneu_velo/show_pneu_velo.html', pneus=pneuVelo, types=typePneuVelo)



# methodes get et post

@app.route('/type-pneu-velo/add')
def add_type_pneu_velo():
    return render_template('type_pneu_velo/add_type_pneu_velo.html')

@app.route('/type-pneu-velo/add', methods=['POST'])
def valid_add_type_pneu_velo():
    libelleType = request.form.get('libelleType')
    flash(f"Ajout type_pneu_velo : libelleType={libelleType}")
    return redirect('/type-pneu-velo/show')


# gros tab get et post
@app.route('/pneu-velo/add')
def add_pneu_velo():
    return render_template('pneu_velo/add_pneu_velo.html', types=typePneuVelo)


# Route POST : traite la soumission
@app.route('/pneu-velo/add', methods=['POST'])
def valid_add_pneu_velo():
    nomPneu = request.form.get('nomPneu')
    typePneu_id = request.form.get('typePneu_id')
    fabricant = request.form.get('fabricant')
    modelePneu = request.form.get('modelePneu')
    largeurPneu = request.form.get('largeurPneu')
    diametreJante = request.form.get('diametreJante')
    dimension = request.form.get('dimension')
    dateCreation = request.form.get('dateCreation')
    prixPneu = request.form.get('prixPneu')
    image = request.form.get('image')

    flash(
        f"Ajout pneu_velo : nomPneu={nomPneu}, typePneu_id={typePneu_id}, fabricant={fabricant}, modelePneu={modelePneu}, largeurPneu={largeurPneu}, diametreJante={diametreJante}, dimension={dimension}, dateCreation={dateCreation}, prixPneu={prixPneu}, image={image}")
    return redirect('/pneu-velo/show')



# fct moidif  et suppr

# Suppression petite table
@app.route('/type-pneu-velo/delete')
def delete_type_pneu_velo():
    id_del = request.args.get('id')
    flash(f"Suppression type_pneu_velo : id={id_del}")
    return redirect('/type-pneu-velo/show')

# Suppression grosse table
@app.route('/pneu-velo/delete')
def delete_pneu_velo():
    id_del = request.args.get('id')
    flash(f"Suppression pneu_velo : id={id_del}")
    return redirect('/pneu-velo/show')


# --- MODIFICATION PETITE TABLE ---

@app.route('/type-pneu-velo/edit')
def edit_type_pneu_velo():
    id_edit = request.args.get('id')
    return render_template('type_pneu_velo/edit_type_pneu_velo.html', id=id_edit, types=typePneuVelo)


@app.route('/type-pneu-velo/edit', methods=['POST'])
def valid_edit_type_pneu_velo():
    id_item = request.form.get('id')
    libelleType = request.form.get('libelleType')
    flash(f"Modification type_pneu_velo : libelleType={libelleType}, id={id_item}")
    return redirect('/type-pneu-velo/show')


# --- MODIFICATION GROSSE TABLE ---

@app.route('/pneu-velo/edit')
def edit_pneu_velo():
    id_edit = request.args.get('id')
    return render_template('pneu_velo/edit_pneu_velo.html', id=id_edit, pneus=pneuVelo, types=typePneuVelo)


@app.route('/pneu-velo/edit', methods=['POST'])
def valid_edit_pneu_velo():
    id_item = request.form.get('id')
    nomPneu = request.form.get('nomPneu')
    typePneu_id = request.form.get('typePneu_id')
    fabricant = request.form.get('fabricant')
    modelePneu = request.form.get('modelePneu')
    largeurPneu = request.form.get('largeurPneu')
    diametreJante = request.form.get('diametreJante')
    dimension = request.form.get('dimension')
    dateCreation = request.form.get('dateCreation')
    prixPneu = request.form.get('prixPneu')
    image = request.form.get('image')

    flash(
        f"Modification pneu_velo : nomPneu={nomPneu}, typePneu_id={typePneu_id}, fabricant={fabricant}, modelePneu={modelePneu}, largeurPneu={largeurPneu}, diametreJante={diametreJante}, dimension={dimension}, dateCreation={dateCreation}, prixPneu={prixPneu}, image={image}, id={id_item}")
    return redirect('/pneu-velo/show')

# filtre
@app.route('/pneu-velo/filtre')
def filtre_pneu_velo():
    return render_template('pneu_velo/front_pneu_velo_filtre_show.html', pneus=pneuVelo, types=typePneuVelo)