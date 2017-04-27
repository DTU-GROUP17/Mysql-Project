CREATE VIEW receiptComponent AS
  SELECT
    recept_id  AS receiptId,
    raavare_id as materialId,
    nom_netto  as netto,
    tolerance  as tolerance
  FROM receptkomponent;