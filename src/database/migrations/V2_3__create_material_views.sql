CREATE VIEW material AS
  SELECT
    raavare_id AS id,
    raavare_navn AS name,
    supplier AS supplier
  FROM raavare;