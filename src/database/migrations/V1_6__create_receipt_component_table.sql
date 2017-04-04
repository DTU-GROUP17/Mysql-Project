CREATE TABLE receptkomponent (
  recept_id  INT,
  raavare_id INT,
  nom_netto  REAL,
  tolerance  REAL,
  PRIMARY KEY (recept_id, raavare_id),
  FOREIGN KEY (recept_id) REFERENCES recept (recept_id),
  FOREIGN KEY (raavare_id) REFERENCES raavare (raavare_id)
)
  ENGINE = innoDB;