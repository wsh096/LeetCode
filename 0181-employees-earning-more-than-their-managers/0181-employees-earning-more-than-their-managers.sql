# Write your MySQL query statement below
SELECT name AS Employee
FROM Employee AS E
WHERE salary > (SELECT salary from employee WHERE id = E.managerId)