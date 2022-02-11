-- *** [group] ***
-- group으로 묶어 table을 다룹니다.

-- [group by]
-- table을 group으로 묶습니다.
-- 묶인 group들에 대해 aggregation function을 통해 집계연산을 할 수 있습니다.
-- group으로 묶기때문에 group 기준 column들과 집계함수 결과들을 조회할 수 있습니다. (다른 column들은 조회할 수 없습니다.)
-- select [기준 column 이름] 통계식[column 이름] from [table 이름] group by [기준 column 이름]
select employee_id from orders group by employee_id order by employee_id;
select employee_id, count(*) as cnt from orders group by employee_id order by employee_id;
select employee_id, ship_via, count(*) as cnt from orders group by employee_id, ship_via order by employee_id, ship_via;

-- [having]
-- having 조건으로 group들을 조회할 수 있습니다.
-- having 조건에는 집계함수가 올 수 있습니다.
-- select [기준 column 이름] 통계식[column 이름] from [table 이름] group by [기준 column 이름] having [조건]
select employee_id, count(*) as cnt from orders group by employee_id having count(*)> 30 order by employee_id;
select employee_id, count(*) as cnt from orders group by employee_id having employee_id > 5 order by employee_id;
