# Write your MySQL query statement below
SELECT D.name AS Department, E.name AS Employee, E.salary AS Salary
FROM Department AS D, Employee E
WHERE E.departmentId = D.id AND
(E.departmentId, salary) IN
(SELECT departmentId, MAX(salary) 
FROM Employee GROUP BY departmentId)