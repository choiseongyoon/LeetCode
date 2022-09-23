# Write your MySQL query statement below
select employee_id
from (
    select a.employee_id 
    from Employees a 
    where a.employee_id not in (select employee_id
                               from Salaries)
    union all
    select a.employee_id 
    from Salaries a 
    where a.employee_id not in (select employee_id
                               from Employees)
    ) a
    order by employee_id