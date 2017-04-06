CREATE TABLE produktbatchkomponent (
  pb_id  INT,
  rb_id  INT,
  tara   REAL,
  netto  REAL,
  opr_id INT,
  PRIMARY KEY (pb_id, rb_id),
  FOREIGN KEY (pb_id) REFERENCES produktbatch (pb_id),
  FOREIGN KEY (rb_id) REFERENCES raavarebatch (rb_id),
  FOREIGN KEY (opr_id) REFERENCES operatoer (opr_id)
)
  ENGINE = innoDB;