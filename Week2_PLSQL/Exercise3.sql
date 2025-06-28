DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE accounts
    SET balance = balance * 1.01
    WHERE account_type = 'savings';
END $$

DELIMITER ;

-- Call the procedure
CALL ProcessMonthlyInterest();

DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept_id INT,
    IN bonus_percent DECIMAL(5,2)
)
BEGIN
    UPDATE employees
    SET salary = salary + (salary * bonus_percent / 100)
    WHERE department_id = dept_id;
END $$

DELIMITER ;

-- Example Call:
CALL UpdateEmployeeBonus(3, 10);  -- 10% bonus to department 3

DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN from_account INT,
    IN to_account INT,
    IN transfer_amount DECIMAL(10,2)
)
BEGIN
    DECLARE from_balance DECIMAL(10,2);

    -- Get the source account balance
    SELECT balance INTO from_balance
    FROM accounts
    WHERE account_id = from_account;

    -- Check sufficient funds
    IF from_balance >= transfer_amount THEN
        -- Deduct from source
        UPDATE accounts
        SET balance = balance - transfer_amount
        WHERE account_id = from_account;

        -- Add to target
        UPDATE accounts
        SET balance = balance + transfer_amount
        WHERE account_id = to_account;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient balance for transfer';
    END IF;
END $$

DELIMITER ;

-- Example Call:
CALL TransferFunds(101, 202, 500.00);
