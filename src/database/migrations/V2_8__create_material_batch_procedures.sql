DELIMITER //
CREATE PROCEDURE createMaterialBatch
  (
    IN p_id         INTEGER,
    IN p_materialId INTEGER,
    IN p_amount     REAL
  )
  BEGIN
    INSERT INTO materialBatch (id, materialId, amount) VALUES (p_id, p_materialId, p_amount);
  END //

CREATE PROCEDURE updateMaterialBatch
  (
    IN p_id         INTEGER,
    IN p_materialId INTEGER,
    IN p_amount     REAL
  )
  BEGIN
    UPDATE materialBatch
    SET
      materialId = p_materialId,
      amount = p_amount
    WHERE id = p_id;
  END //

CREATE PROCEDURE updateOrCreateMaterialBatch
  (
    IN p_id         INTEGER,
    IN p_materialId INTEGER,
    IN p_amount     REAL
  )
  BEGIN
    INSERT INTO materialBatch (id, materialId, amount) VALUES (p_id, p_materialId, p_amount)
    ON DUPLICATE KEY UPDATE materialId = p_materialId, amount = p_amount;
  END //
DELIMITER ;


