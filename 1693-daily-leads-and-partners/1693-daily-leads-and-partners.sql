# # Write your MySQL query statement below

select date_id  
, make_name 
, count(distinct lead_id ) as unique_leads 
, count(distinct partner_id ) as unique_partners
from DailySales
group by date_id  
, make_name

# from (
#     select date_id  ,make_name , count(distinct lead_id) as lead_id
#     from DailySales) a
#     left join (
#     select date_id  ,make_name , count(distinct partner_id)  as partner_id
#     from DailySales)b
#     on a.date_id = b.date_id and a.make_name = b.make_name

