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
    n int := 10;
    acc int := 0;
    i int := 1;
  
  begin
    loop
      acc := acc + i;
      exit when i = n;
      i := i + 1;	
    end loop;
    raise notice '합계는 %', acc;
  end;
$$
