-- *** [aggregation] ***
-- table에 대해 통계를 연산합니다.

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

-- [행순번]
-- 해당 행의 순서를 정의합니다.
-- * basic
select row_number() over () [column alias 이름] from [table 이름]

-- * 정렬기준에 맞게 순번 정의
select row_number() over (order by [순번 기준 column]) [column alias 이름] from [table 이름]

-- * 정렬기준에 맞게 순번 정의
select row_number() over (order by [순번 기준 column]) [column alias 이름] from [table 이름]

-- * 그룹기준에 맞게 순번 정의
select row_number() over (partion by [그룹 기준 column] order by [순번 기준 column]) [column alias 이름] from [table 이름]
