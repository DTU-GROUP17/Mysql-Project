DELIMITER //
CREATE PROCEDURE createMaterial
  (
    IN p_id       INTEGER,
    IN p_name     TEXT,
    IN p_supplier TEXT
  )
  BEGIN
    INSERT INTO material (id, name, supplier) VALUES (p_id, p_name, p_supplier);
  END //

CREATE PROCEDURE updateMaterial
  (
    IN p_id       INTEGER,
    IN p_name     TEXT,
    IN p_supplier TEXT
  )
  BEGIN
    UPDATE material
    SET name = p_name, supplier = p_supplier
    WHERE id = p_id;
  END //

CREATE PROCEDURE updateOrCreateMaterial
  (
    IN p_id       INTEGER,
    IN p_name     TEXT,
    IN p_supplier TEXT
  )
  BEGIN
    INSERT INTO material (id, name, supplier) VALUES (p_id, p_name, p_supplier)
    ON DUPLICATE KEY UPDATE id = p_id, name = p_name, supplier = p_supplier;
  END //
DELIMITER ;


