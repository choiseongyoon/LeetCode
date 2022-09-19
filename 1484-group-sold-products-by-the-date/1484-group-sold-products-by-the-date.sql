# Write your MySQL query statement below
select sell_date
, COUNT(DISTINCT product) num_sold
, GROUP_CONCAT(DISTINCT product ORDER BY product) products
from Activities
group by sell_date
order by sell_date