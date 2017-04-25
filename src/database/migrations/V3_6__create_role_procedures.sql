DELIMITER //
CREATE PROCEDURE createRole
  (
    IN p_id               INT,
    IN p_name             TEXT
  )
  BEGIN
    INSERT INTO roles (id, name) VALUES (p_id, p_name);
  END //

CREATE PROCEDURE updateRole
  (
    IN p_id               INT,
    IN p_name             TEXT
  )
  BEGIN
    UPDATE roles
    SET name = p_name
    WHERE id = p_id;
  END //

CREATE PROCEDURE updateOrCreateRole
  (
    IN p_id               INT,
    IN p_name             TEXT
  )
  BEGIN
    INSERT INTO roles (id, name) VALUES (p_id, p_name)
    ON DUPLICATE KEY UPDATE name = p_name;
  END //
DELIMITER ;


