# Write your MySQL query statement below
SELECT employee_id
FROM Employees
WHERE salary < 30000 AND manager_id NOT IN(SELECT e.employee_id FROM Employees AS e)
ORDER BY employee_id