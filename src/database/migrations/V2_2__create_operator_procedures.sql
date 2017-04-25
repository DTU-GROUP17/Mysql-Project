DELIMITER //
CREATE PROCEDURE createOperator
  (
    IN p_id       INTEGER,
    IN p_name     TEXT,
    IN p_ini      TEXT,
    IN p_cpr      TEXT,
    IN p_password TEXT
  )
  BEGIN
    INSERT INTO operator (id, name, ini, cpr, password) VALUES (p_id, p_name, p_ini, p_cpr, p_password);
  END //

CREATE PROCEDURE updateOperator
  (
    IN p_id       INTEGER,
    IN p_name     TEXT,
    IN p_ini      TEXT,
    IN p_cpr      TEXT,
    IN p_password TEXT
  )
  BEGIN
    UPDATE operator
      SET name = p_name, ini = p_ini, cpr = p_cpr, password = p_password
    WHERE id = p_id;
  END //

CREATE PROCEDURE updateOrCreateOperator
  (
    IN p_id       INTEGER,
    IN p_name     TEXT,
    IN p_ini      TEXT,
    IN p_cpr      TEXT,
    IN p_password TEXT
  )
  BEGIN
    INSERT INTO operator (id, name, ini, cpr, password) VALUES (p_id, p_name, p_ini, p_cpr, p_password)
      ON DUPLICATE KEY UPDATE name = p_name, ini = p_ini, password = p_password;
  END //
DELIMITER ;


