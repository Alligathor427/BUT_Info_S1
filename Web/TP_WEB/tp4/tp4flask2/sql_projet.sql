DROP TABLE IF EXISTS etudiant;
DROP TABLE IF EXISTS groupe;

CREATE TABLE groupe (
    id_groupe INT AUTO_INCREMENT,
    libelle_groupe VARCHAR(255),
    PRIMARY KEY(id_groupe)
);

CREATE TABLE etudiant (
    id_etudiant INT AUTO_INCREMENT,
    nom_etudiant VARCHAR(255),
    groupe_etudiant_id INT,
    PRIMARY KEY(id_etudiant),
    FOREIGN KEY (groupe_etudiant_id) REFERENCES groupe(id_groupe)
);

INSERT INTO groupe (id_groupe, libelle_groupe) VALUES
(NULL, 'A1'), (NULL, 'A2'), (NULL, 'B1'), (NULL, 'B2'), (NULL, 'C1'), (NULL, 'C2');

INSERT INTO etudiant (id_etudiant, nom_etudiant, groupe_etudiant_id) VALUES
(NULL, 'tom', 1), (NULL, 'enzo', 1), (NULL, 'laurence', 2), (NULL, 'theo', 2), (NULL, 'mehdi', 3);

SELECT * FROM etudiant
SELECT * FROM groupe
