# Write your MySQL query statement below
select a.name, sum(amount) as balance
from Users a
left join Transactions b
on a.account = b.account
group by name
having sum(amount) >10000