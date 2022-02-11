-- *** [subquery] ***
-- 다른 쿼리문 안에 감싸져 있는 쿼리를 서브쿼리라 합니다.
-- 서브쿼리는 select, insert, update, delete와 함께 사용됩니다.
-- 서브쿼리는 단일행, 다중행, 연관 서브쿼리, 인라인뷰가 있습니다.

-- [single row subquery]
-- select * from [table a 이름] where [비교 조건] (select [단일 column] from [table b 이름])
-- 서브쿼리의 결과는 단일행, 단일열이어야 하며 비교연산자와 함께 사용됩니다.
-- (inner) join으로 표현될 수 있습니다.
select * from orders where customer_id = (select customer_id from customers where postal_code = '05023');
select * from orders o join customers c on o.customer_id = c.customer_id where c.postal_code = '05023';

-- [multiple row subquery]
-- select * from [table a 이름] where [in, exists, not in, any, some, all] (select [단일 column] from [table b 이름])
-- 서브쿼리의 결과는 다중행, 단일열이며 in, exists, not in, any, some, all 연산자와 함께 사용됩니다.
-- (inner) join으로 표현될 수 있습니다.
select * from orders where customer_id in (select customer_id from customers where postal_code = '05033');
select * from orders o join customers c on o.customer_id = c.customer_id where c.postal_code = '05033';

select * from orders where customer_id in (select customer_id from customers);
select * from orders o join customers c on o.customer_id = c.customer_id;

-- [inline view subquery]

-- [correlated subquery]