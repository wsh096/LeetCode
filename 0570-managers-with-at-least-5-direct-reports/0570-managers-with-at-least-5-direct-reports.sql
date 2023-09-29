# Write your MySQL query statement below
SELECT e.name AS name
FROM Employee AS e
INNER JOIN Employee AS m
ON e.id = m.managerId
GROUP BY e.id
HAVING COUNT(e.id) >= 5