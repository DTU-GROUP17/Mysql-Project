CREATE TABLE raavarebatch (
  rb_id      INT PRIMARY KEY,
  raavare_id INT,
  maengde    REAL,
  FOREIGN KEY (raavare_id) REFERENCES raavare (raavare_id)
)
  ENGINE = innoDB;