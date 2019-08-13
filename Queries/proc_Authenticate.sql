DELIMITER //
DROP FUNCTION IF EXISTS Authenticate //
CREATE FUNCTION Authenticate(v_username VARCHAR(255),v_password VARCHAR(255))
RETURNS VARCHAR(20) DETERMINISTIC
BEGIN
	DECLARE u_role VARCHAR(20);
	SELECT role INTO u_role FROM credentials WHERE username=username AND u_password=v_password;
    RETURN u_role;
END
//
DELIMITER ;

SELECT Authenticate('Admin','nimda');