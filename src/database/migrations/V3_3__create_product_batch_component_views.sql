CREATE VIEW productBatchComponent AS
  SELECT
    pb_id  AS productBatchId,
    rb_id  AS materialBatchId,
    tara   AS tara,
    netto  AS netto,
    opr_id AS operatorId
  FROM produktbatchkomponent;