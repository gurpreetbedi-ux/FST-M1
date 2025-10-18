SELECT *
FROM orders
WHERE salesman_id = (SELECT salesman_id FROM orders WHERE customer_id = 3007);
SELECT *
FROM orders
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city = 'New York');
SELECT COUNT(customer_id)
FROM customer
WHERE grade > (SELECT AVG(grade) FROM customer WHERE city = 'New York');
SELECT o.*
FROM orders o
JOIN salesman s ON o.salesman_id = s.salesman_id
WHERE s.commission = (SELECT MAX(commission) FROM salesman);