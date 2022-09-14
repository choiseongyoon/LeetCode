# Write your MySQL query statement below
SELECT  a.ID
FROM Weather A
INNER JOIN Weather B
ON A.recordDate=date_add(B.recordDate,interval 1 day)
WHERE A.temperature >B.temperature 