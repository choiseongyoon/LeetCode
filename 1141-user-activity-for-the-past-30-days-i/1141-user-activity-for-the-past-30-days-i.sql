# Write your MySQL query statement belowactive_users(
#select a.activity_date as day,count(*) as active_users 
select a.activity_date as day,count(*) as active_users
from (
SELECT distinct activity_date,user_id
FROM Activity
where activity_date>='2019-06-28' and activity_date<='2019-07-27') a
group by a.activity_date
order by a.activity_date

