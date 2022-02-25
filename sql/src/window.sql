-- *** [window] ***
-- table의 행에 대해 통계를 연산합니다.

-- [window function]
-- select [window function] over (partiton by [묶음 기준 column 이름] order by [정렬 기준 column 이름] from [table 이름]

-- * row_number
-- 해당 묶음 및 정렬기준에 맞는 행의 순위를 계산합니다.
-- select count(*) from [table 이름]
select row_number() over(order by order_date), * from orders;
select row_number() over(partition by ship_via order by order_date), * from orders;
select row_number() over(partition by ship_via order by order_date) od, row_number() over(partition by ship_via order by required_date) rd, * from orders order by od, rd;

-- * rank
-- 해당 묶음 및 정렬기준에 맞는 행의 순위를 계산합니다.
-- row_number와 달리 동순위를 계산하며, 다음 순위는 동순위 행수만큼 늘어납니다.
select rank() over(order by order_date), * from orders;

-- * dense_rank
-- 해당 묶음 및 정렬기준에 맞는 행의 순위를 계산합니다.
-- rank와 유사하게 동순위를 계산하며, 다음 순위는 동순위 행수만큼 늘어나지 않습니다.
select dense_rank() over(order by order_date), * from orders;

-- * lag
-- 현재 행보다 앞(n)에 있는 행의 지정한 column을 가져옵니다.
select order_id, lag(order_id) over(order by order_date), * from orders;
select order_id, lag(order_id, 3) over(order by order_date), * from orders;

-- * lead
-- 현재 행보다 뒤(n)에 있는 행의 지정한 column을 가져옵니다.
select order_id, lead(order_id) over(order by order_date), * from orders;
select order_id, lead(order_id, 3) over(order by order_date), * from orders;

-- * first_value
-- 해당 묶음 및 정렬기준에 맞는 첫번째 순위 행의 column을 반환합니다.
select first_value(order_id) over(order by order_date), * from orders;

-- * last_value
-- 해당 묶음 및 정렬기준에 맞는 마지막 순위 행의 column을 반환합니다.
select last_value(order_id) over(order by order_date), * from orders;

-- [window frame]
-- select [window function] over (partiton by [묶음 기준 column 이름] order by [정렬 기준 column 이름] rows between [시작행] and [끝행] from [table 이름]
-- range는 current row, unbouned preceding, [수] preceding, unbouned following, [수] following이 있습니다.
select ship_via, sum(ship_via) over(order by order_date rows between unbounded preceding and current row), * from orders;
select ship_via, sum(ship_via) over(order by order_date rows between 1 preceding and 1 following), * from orders;
select ship_via, sum(ship_via) over(order by order_date rows between current row and unbounded following), * from orders;