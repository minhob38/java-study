-- *** [반복문] ***
-- sql을 반복하여 실행합니다.

-- [loop]
-- loop
--   [반복 코드]
--   exit when [조건] 또는 if [조건] exit;
-- end loop;

-- [for]
-- for i in [1..n]
--   loop
--     [반복 코드]
--     exit when [조건] 또는 if [조건] exit;
--   end loop;

-- [for each] -> TODO

-- loop
create or replace function summation(n int)
returns int as
$$
  declare 
    acc int := 0;
    i int := 1;
  
  begin
    loop
	  acc := acc + i;
	  exit when i = n;
      -- select i + 1 into i;
      i := i + 1;	
    end loop;
    
	return acc;
  end;
$$
language plpgsql;

select summation(10);

-- for
create or replace function summation(n int)
returns int as
$$
  declare 
    acc int := 0;
    i int := 1;
  
  begin
    for i in 1..n
      loop
	    acc := acc + i;
        i := i + 1;	
      end loop;
	return acc;
  end;
$$
language plpgsql;

select summation(10);
