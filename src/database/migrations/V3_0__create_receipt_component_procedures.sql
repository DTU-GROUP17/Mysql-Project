DELIMITER //
CREATE PROCEDURE createReceiptComponent
  (
    IN p_receiptId  INTEGER,
    IN p_materialId INTEGER,
    IN p_netto      REAL,
    IN p_tolerance  REAL
  )
  BEGIN
    INSERT INTO receiptComponent (receiptId, materialID, netto, tolerance) VALUES (p_receiptId, p_materialId, p_netto, p_tolerance);
  END //

CREATE PROCEDURE updateReceiptComponent
  (
    IN p_receiptId  INTEGER,
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
    WHERE receiptId = p_receiptId AND materialId = p_materialId;
  END //

CREATE PROCEDURE updateOrCreateReceiptComponent
  (
    IN p_receiptId  INTEGER,
    IN p_materialId INTEGER,
    IN p_netto      REAL,
    IN p_tolerance  REAL
  )
  BEGIN
    INSERT INTO receiptComponent (receiptId, materialID, netto, tolerance) VALUES (p_receiptId, p_materialId, p_netto, p_tolerance)
    ON DUPLICATE KEY UPDATE materialId = p_materialId, netto = p_netto, tolerance = p_tolerance;
  END //
DELIMITER ;


