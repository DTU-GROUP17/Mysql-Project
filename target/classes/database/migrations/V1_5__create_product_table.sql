CREATE TABLE produktbatch (
  pb_id     INT PRIMARY KEY,
  status    INT,
  recept_id INT,
  FOREIGN KEY (recept_id) REFERENCES recept (recept_id)
)
  ENGINE = innoDB;