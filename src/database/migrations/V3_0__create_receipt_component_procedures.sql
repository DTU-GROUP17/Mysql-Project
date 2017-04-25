DELIMITER //
CREATE PROCEDURE createReceiptComponent
  (
    IN p_id         INTEGER,
    IN p_materialId INTEGER,
    IN p_netto      REAL,
    IN p_tolerance  REAL
  )
  BEGIN
    INSERT INTO receiptComponent (id, materialID, netto, tolerance) VALUES (p_id, p_materialId, p_netto, p_tolerance);
  END //

CREATE PROCEDURE updateReceiptComponent
  (
    IN p_id         INTEGER,
    IN p_materialId INTEGER,
    IN p_netto      REAL,
    IN p_tolerance  REAL
  )
  BEGIN
    UPDATE receiptComponent
    SET
      materialId = p_materialId,
      netto = p_netto,
      tolerance = p_tolerance
    WHERE id = p_id;
  END //

CREATE PROCEDURE updateOrCreateReceiptComponent
  (
    IN p_id         INTEGER,
    IN p_materialId INTEGER,
    IN p_netto      REAL,
    IN p_tolerance  REAL
  )
  BEGIN
    INSERT INTO receiptComponent (id, materialID, netto, tolerance) VALUES (p_id, p_materialId, p_netto, p_tolerance)
    ON DUPLICATE KEY UPDATE materialId = p_materialId, netto = p_netto, tolerance = p_tolerance;
  END //
DELIMITER ;


