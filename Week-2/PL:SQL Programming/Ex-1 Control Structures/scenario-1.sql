 --The bank wants to apply a discount to loan interest rates for customers above 60 years old.

BEGIN
    FOR cust_loan IN (
        SELECT l.LoanID, l.InterestRate, c.DOB
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
    ) LOOP
        IF MONTHS_BETWEEN(SYSDATE, cust_loan.DOB) / 12 > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = cust_loan.LoanID;
        END IF;
    END LOOP;

    COMMIT;
END;
/