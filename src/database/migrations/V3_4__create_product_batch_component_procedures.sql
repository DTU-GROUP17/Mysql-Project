DELIMITER //
CREATE PROCEDURE createProductBatchComponent
  (
    IN p_id               INT,
    IN p_materialBatchId  INT,
    IN p_tara             REAL,
    IN p_netto            REAL,
    IN p_operatorId       INT
  )
  BEGIN
    INSERT INTO productBatchComponent (id, materialBatchId, tara, netto, operatorID) VALUES (p_id, p_materialBatchId, p_tara, p_netto, p_operatorId);
  END //

CREATE PROCEDURE updateProductBatchComponent
  (
    IN p_id               INT,
    IN p_materialBatchId  INT,
    IN p_tara             REAL,
    IN p_netto            REAL,
    IN p_operatorId       INT
  )
  BEGIN
    UPDATE productBatchComponent
    SET
      materialBatchId = p_materialBatchId,
      tara = p_tara,
      netto = p_netto,
      operatorID = p_operatorId
    WHERE id = p_id;
  END //

CREATE PROCEDURE updateOrCreateProductBatchComponent
  (
    IN p_id               INT,
    IN p_materialBatchId  INT,
    IN p_tara             REAL,
    IN p_netto            REAL,
    IN p_operatorId       INT
  )
  BEGIN
    INSERT INTO productBatchComponent (id, materialBatchId, tara, netto, operatorID) VALUES (p_id, p_materialBatchId, p_tara, p_netto, p_operatorId)
    ON DUPLICATE KEY UPDATE materialBatchId = p_materialBatchId, tara = p_tara, netto = p_netto, operatorID = p_operatorId;
  END //
DELIMITER ;


