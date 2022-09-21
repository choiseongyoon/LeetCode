# Write your MySQL query statement below
select a.product_id, a.product_name
from(
select a.product_id, b.product_name,min(sale_date) as min,max(sale_date) as max
from Sales a
left join Product b on a.product_id = b.product_id
group by a.product_id) a
where min>='2019-01-01' and max<='2019-03-31'


