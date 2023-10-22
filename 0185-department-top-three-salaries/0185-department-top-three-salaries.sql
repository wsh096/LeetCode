# Write your MySQL query statement below
SELECT d.name AS department, e1.name AS employee, e1.salary AS Salary
FROM employee AS e1, Department AS d
WHERE e1.departmentID = d.id AND 3 > (SELECT COUNT(DISTINCT (e2.Salary)) 
FROM Employee AS e2
WHERE e2.Salary > e1.Salary AND e1.DepartmentId = e2.DepartmentId)