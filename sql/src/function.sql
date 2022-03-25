-- *** [function] ***
-- 함수는 입력과 출력 간 관계의 표현식이며, 또다른 의미로는 하나의 단위로 실행되는 sql code의 집합입니다.

-- [join 유형]
-- * inner join
-- on 조건에 맞는 table a와 table b의 행들을 연결하여 새로운 table을 만듭니다.
-- join 결과는 교집합과 같습니다.
-- select [column 이름] from [table a 이름] join [table b 이름] on [table a's join key column] = [table b's join key column]

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

--

create or replace function fn_add(a int, b int)
returns int as
$$
    begin 
        return a + b;
    end;
$$
language plpgsql;
select fn_add(3, 5);
--

?????
create or replace function fn_table_count()
returns int as
$$
    declare
        table_name varchar := 'orders';
    begin 
        return count(*) from  a into table_name;
    end;
$$
language plpgsql;
---