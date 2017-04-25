CREATE VIEW receiptComponent AS
  SELECT
    recept_id  AS id,
    raavare_id as materialID,
    nom_netto  as netto,
    tolerance  as tolerance
  FROM receptkomponent;