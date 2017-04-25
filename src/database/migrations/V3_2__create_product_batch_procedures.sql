DELIMITER //
CREATE PROCEDURE createProductBatch
  (
    IN p_id         INTEGER,
    IN p_status     INTEGER,
    IN p_receiptId  INTEGER
  )
  BEGIN
    INSERT INTO productBatch (id, status, receiptId) VALUES (p_id, p_status, p_receiptId);
  END //

CREATE PROCEDURE updateProductBatch
  (
    IN p_id         INTEGER,
    IN p_status     INTEGER,
    IN p_receiptId  INTEGER
  )
  BEGIN
    UPDATE productBatch
    SET
      status = p_status,
      receiptId = p_receiptId
    WHERE id = p_id;
  END //

CREATE PROCEDURE updateOrCreateProductBatch
  (
    IN p_id         INTEGER,
    IN p_status     INTEGER,
    IN p_receiptId  INTEGER
  )
  BEGIN
    INSERT INTO productBatch (id, status, receiptId) VALUES (p_id, p_status, p_receiptId)
    ON DUPLICATE KEY UPDATE status = p_status, receiptId = p_receiptId;
  END //
DELIMITER ;


