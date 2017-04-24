DELIMITER //
CREATE PROCEDURE createReceipt
  (
    IN p_id       INTEGER,
    IN p_name     TEXT
  )
  BEGIN
    INSERT INTO receipt (id, name) VALUES (p_id, p_name);
  END //

CREATE PROCEDURE updateReceipt
  (
    IN p_id       INTEGER,
    IN p_name     TEXT
  )
  BEGIN
    UPDATE receipt
    SET name = p_name
    WHERE id = p_id;
  END //

CREATE PROCEDURE updateOrCreateReceipt
  (
    IN p_id       INTEGER,
    IN p_name     TEXT
  )
  BEGIN
    INSERT INTO receipt (id, name) VALUES (p_id, p_name)
    ON DUPLICATE KEY UPDATE id = p_id, name = p_name;
  END //
DELIMITER ;


