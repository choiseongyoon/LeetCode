# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE FROM Person 
WHERE ID  NOT IN (SELECT B.ID 
FROM(
SELECT MIN(id) AS ID
FROM Person
GROUP BY email
)B
                  )