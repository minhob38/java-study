-- *** [do] ***
-- anoymous code block을 실행합니다.

-- [do block]
-- do $$
-- '(또는 $$)
--      declare
--          [변수이름] [자료형]:= [변수값];
--      begin
--  	    [function body]
--      end;
-- '(또는 $$)

-- [raise]
-- message를 level(debug, log, info, omtice, warning, execption)에 따라 보여줍니다.
-- do $$
-- '(또는 $$)
--      declare
--          [변수이름] [자료형]:= [변수값];
--      begin
--  	    [function body]
--      end;
-- '(또는 $$)

do
$$
    declare
        table_name varchar := 'orders';
    begin 
        raise notice 'order의 개수는 %입니다.', (count(*) from  a into table_name);
    end;
$$
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
