# Write your MySQL query statement below
select a.name as customers
from customers a
left join orders b
on b.customerId = a.id
where b.customerId is null