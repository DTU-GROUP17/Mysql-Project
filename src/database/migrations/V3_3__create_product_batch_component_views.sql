CREATE VIEW productBatchComponent AS
  SELECT
    pb_id  AS id,
    rb_id  AS materialBatchId,
    tara   AS tara,
    netto  AS netto,
    opr_id AS operatorID
  FROM produktbatchkomponent;