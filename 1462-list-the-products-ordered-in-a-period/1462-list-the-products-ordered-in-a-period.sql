# Write your MySQL query statement below
SELECT p.product_name, SUM(o.unit) AS unit
FROM Products AS p
LEFT JOIN Orders AS o USING(product_id)
WHERE MONTH(o.order_date) = '02' AND YEAR(o.order_date) = '2020'
GROUP BY p.product_name
HAVING SUM(o.unit) >= 100