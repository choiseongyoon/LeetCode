# Write your MySQL query statement below

SELECT event_day AS DAY,EMP_ID, SUM(OUT_TIME-IN_TIME) AS TOTAL_TIME
FROM Employees
GROUP BY event_day,EMP_ID;