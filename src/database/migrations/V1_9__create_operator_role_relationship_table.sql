CREATE TABLE operator_roles (
  operator_id INT NOT NULL,
  role_id INT UNSIGNED NOT NULL,
  FOREIGN KEY (operator_id) REFERENCES operatoer(opr_id) ON DELETE CASCADE,
  FOREIGN KEY (role_id) REFERENCES roles(id) ON DELETE CASCADE
)