CREATE VIEW materialBatch AS
  SELECT
    rb_id AS id,
    raavare_id AS materialId,
    amount as amount
  FROM raavarebatch;