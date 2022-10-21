-- *** [function] ***
-- 함수는 입력과 출력 간 관계의 표현식이며, 또다른 의미로는 하나의 단위로 실행되는 sql code의 집합입니다.
-- sql 함수는 마지막 sql 코드를 실행하고 반환합니다.


-- [함수선언]
-- * sql
-- create or replace function [함수이름]([매개변수] [자료형])
-- returns [반환 자료형] as
-- '(또는 $$)
--  	[function body]
-- '(또는 $$)
-- language sql;

-- * plpgsql
-- create or replace function [함수이름]([매개변수] [자료형])
-- returns [반환 자료형] as
-- '(또는 $$)
--      declare
--          [변수이름] [자료형]:= [변수값];
--      begin
--  	    [function body]
--      end;
-- '(또는 $$)
-- language plpgsql;
-- (begin / end는 {}와 비슷합니다.)

create or replace function fn_add(a int, b int)
returns int as
$$
    declare
        table_name varchar := 'orders';
    begin 
        return count(*) from  a into table_name;
    end;
$$
language plpgsql;
select fn_add(3, 5);
--

-- function (sql)
create or replace function fn_order_count()
returns int8 as
'
	select count(*) from orders;
'
language sql;
select fn_order_count();

create or replace function fn_order_count()
returns int as
$$
	select count(*) from orders;
$$
language sql;
select fn_order_count();

create or replace function fn_add(a int, b int)
returns int as
$$
	select a + b;
$$
language sql;
select fn_add(3, 5);

create or replace function fn_add(a int, b int)
returns int as
$$
	select $1 + $2;
$$
language sql;
select fn_add(3, 5);


-- function (plpgsql)
create or replace function fn_order_count()
returns int as
$$
    begin
        return count(*) from orders;
    end;
$$
language plpgsql;

select fn_order_count();
--
create or replace function fn_add(int, int)
returns int as
$$
    declare
        a alias for $1;
        b alias for $2;
    begin 
        return a + b;
    end;
$$
language plpgsql;

select fn_add(3, 5);

--

create or replace function fn_add(int, int)
returns int as
$$
    begin 
        return $1 + $2;
    end;
$$
language plpgsql;
select fn_add(3, 5);

create or replace function fn_add(a int, b int)
returns int as
$$
    begin 
        return a + b;
    end;
$$
language plpgsql;
select fn_add(3, 5);

create or replace function fn_table_count()
returns int as
$$
    declare
        table_name varchar := 'orders';
    begin 
        return count(*) from table_name;
    end;
$$
language plpgsql;
