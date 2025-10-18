SELECT 
    customer_name, salesman_id 
FROM
    Customers
WHERE
    salesman_id IN (
        SELECT
            salesman_id
        FROM
            Orders
        GROUP BY
            salesman_id
        HAVING
            COUNT(*) > 1
    )
ORDER BY
    customer_name;