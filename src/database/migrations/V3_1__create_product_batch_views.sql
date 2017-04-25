CREATE VIEW productBatch AS
  SELECT
    pb_id     AS id,
    status    AS status,
    recept_id AS receiptId
  FROM produktbatch;