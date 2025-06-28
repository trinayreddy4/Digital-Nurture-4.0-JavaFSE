DELIMITER $$

CREATE PROCEDURE promote_to_vip()
BEGIN
    UPDATE customers
    SET is_vip = TRUE
    WHERE balance > 10000;
END $$

DELIMITER ;

-- Call the procedure
CALL promote_to_vip();
