-- *** [반복문] ***
-- sql을 반복하여 실행합니다.

-- [loop]
-- loop
--   [반복 코드]
--   exit when [조건] 또는 if [조건] exit;
-- end loop;

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
