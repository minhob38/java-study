-- *** [aggregation] ***
-- table에 대해 통계를 연산합니다.

-- [group by]
-- table을 group으로 묶습니다.
-- 묶인 group들에 대해 aggregation function을 통해 집계연산을 할 수 있습니다.
-- group으로 묶기때문에 group 기준 column들과 집계함수 결과들을 조회할 수 있습니다. (다른 column들은 조회할 수 없습니다.)
-- select [기준 column 이름] 통계식[column 이름] from [table 이름] group by [기준 column 이름]
select employee_id from orders group by employee_id order by employee_id;
select employee_id, count(*) as cnt from orders group by employee_id order by employee_id;
select employee_id, ship_via, count(*) as cnt from orders group by employee_id, ship_via order by employee_id, ship_via;

-- [개수]
-- 해당 table의 row 개수를 계산합니다.
-- select count(*) from [table 이름]
select count(*) from orders;

-- [총합]
-- 해당 column의 총합을 계산합니다.
-- select sum([column 이름]) from [table 이름]
select sum(ship_via) from orders;

-- [평균]
-- 해당 column의 평균 계산합니다.
-- select avg([column 이름]) from [table 이름]
select avg(ship_via) from orders;
