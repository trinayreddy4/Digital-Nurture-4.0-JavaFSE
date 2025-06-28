DELIMITER $$

CREATE PROCEDURE send_loan_reminders()
BEGIN
    SELECT l.loan_id, c.name, l.due_date
    FROM loans l
    JOIN customers c ON l.customer_id = c.customer_id
    WHERE l.due_date BETWEEN CURDATE() AND CURDATE() + INTERVAL 30 DAY;
END $$

DELIMITER ;

-- Call the procedure
CALL send_loan_reminders();
