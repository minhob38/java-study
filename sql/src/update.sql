-- *** [update] ***
-- 조건에 맞는 row의 column을 update합니다.

-- [update하기 - basic]
-- 해당 table의 row를 update합니다.
update [table 이름] set [column 1] = [value 1], [column 2] = [value 2], …, [column n] = [value n] where [조건]

-- [update하기 - join]
-- 다른 table을 참조하여 row를 update합니다.
update [table 이름] set [column 1] = [value 1], [column 2] = [value 2], …, [column n] = [value n] from [다른 table 이름] where [join 조건] and [조건]

-- [update note]
-- * group별 순번 column 만들기
update [table 이름] set [순번 column 이름] = subquery.row_num from (select row_number () over (partition by [group 기준 column] order by [순번 기준 column) row_num, * from [table 이름]) as subquery where [table id] = [subquery id];

