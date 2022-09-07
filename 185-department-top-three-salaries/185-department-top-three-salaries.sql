# Write your MySQL query statement below
SELECT d.Name Department, e.Name Employee, e.Salary Salary
FROM Employee e JOIN Department d ON e.DepartmentId = d.Id
WHERE e.Salary IN (
    SELECT * FROM (
        SELECT DISTINCT(Salary) 
        FROM Employee 
        WHERE DepartmentId = d.Id 
        ORDER BY Salary DESC LIMIT 3
    ) AS_
)

