-- *** [select] ***
-- select [column 이름] from [table 이름]으로 table을 조회할 수 있습니다.
-- * 전체 column 조회하기
select * from orders;

-- * 특정 column 조회하기
select order_id, customer_id from orders;

-- * column alias
select order_id oid, customer_id cid from orders;

-- * table alias
select o.order_id, o.customer_id from orders o;

-- [정해진 개수로 조회하기]
-- select [column 이름] from [table 이름] limit [가져올 record 수]으로 조회할 수 있습니다.
-- select [column 이름] from [table 이름] offset [시작행] limit [가져올 record 수]으로 조회할 수 있습니다.
-- TODO: fetch
select * from orders limit 10;
select * from orders offset 5 limit 10;

-- [조건으로 조회하기]
-- select [column 이름] from [table 이름] where [조건]으로 조회할 수 있습니다.
-- * = 조건
select * from orders where employee_id = 3;

-- * between 조건 (between a and b에서 a와 b는 포함됩니다.)
select * from orders where order_id between 10250 and 10260;
select * from orders where order_id not between 10250 and 10260;

-- * in 조건
select * from orders where ship_country in ('Germany', 'Finland');
select * from orders where ship_country not in ('Germany', 'Finland');

-- * like 조건 (%는 글자수를 지정하지 않으며, _는 글자수를 지정합니다.)
select * from orders where customer_id like 'WA%';
select * from orders where customer_id like 'WA___';

select * from orders where customer_id not like 'WA%';
select * from orders where customer_id not like 'WA___';

-- * and / or 조건
select * from orders where employee_id = 3 and ship_country = 'Germany';
select * from orders where employee_id = 3 or ship_country = 'Germany';

-- * null 조건
select * from orders where ship_region is null;
select * from orders where ship_region is not null;

-- [정렬하기]
-- default는 오름차순(asc)입니다.
-- table row를 전체 조회하기에, select에 없는 column에 대해 정렬할 수 있습니다.
select * from orders order by customer_id;
select * from orders order by customer_id asc, order_date desc;
select order_id from orders order by customer_id;

-- [중복없애기]
-- select distinct [column 이름] from [table 이름]으로 중복을 없앨 수 있습니다.
-- select distinct on([column 이름]) [column 이름] from [table 이름]으로 특정 column의 중복을 없앨 수 있습니다.
select distinct customer_id from orders order by customer_id;
select distinct customer_id, ship_via from orders order by customer_id, ship_via;
select distinct on(customer_id) customer_id, ship_via from orders order by customer_id;





