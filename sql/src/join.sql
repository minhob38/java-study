-- *** [join] ***
-- join key를 기준으로 table을 연결합니다.

-- [join 유형]
-- * inner join
-- on 조건에 맞는 table a와 table b의 행들을 연결하여 새로운 table을 만듭니다.
-- join 결과는 교집합과 같습니다.
-- select [column 이름] from [table a 이름] join [table b 이름] on [table a's join key column] = [table b's join key column]
select u.email, p.author, * from users u join posts p on u.email = p.author;

-- * left join (outer join)
-- 왼쪽 table을 기준으로, on 조건에 맞는 오른쪽 table의 행들을 연결하여 새로운 table을 만듭니다.
-- 왼쪽 table을 기준으로, on 조건에 맞지 않으면 오른쪽에 null 행으로 채웁니다.
-- select [column 이름] from [table a 이름] left join [table b 이름] on [table a's join key column] = [table b's join key column]
select u.email, p.author, * from users u left join posts p on u.email = p.author;

-- * right join (outer join)
-- 오른쪽 table을 기준으로, on 조건에 맞는 왼쪽 table의 행들을 연결하여 새로운 table을 만듭니다.
-- 오른쪽 table을 기준으로, on 조건에 맞지 않으면 왼쪽에 null 행으로 채웁니다.
-- select [column 이름] from [table a 이름] right join [table b 이름] on [table a's join key column] = [table b's join key column]
select u.email, p.author, * from users u right join posts p on u.email = p.author;

-- * full join
-- 왼쪽/오른쪽 table을 기준으로, on 조건에 맞는 오른쪽/왼쪽 table의 행들을 연결하여 새로운 table을 만듭니다.
-- 왼쪽/오른쪽 table을 기준으로, on 조건에 맞지 않으면 오른쪽/왼쪽에 null 행으로 채웁니다.
-- select [column 이름] from [table a 이름] full join [table b 이름] on [table a's join key column] = [table b's join key column]
select u.email, p.author, * from users u full join posts p on u.email = p.author;

-- * cross join
-- cross join은 왼쪽/오른쪽 table의 서로 교차한 행들을 연결하여 새로운 table을 만듭니다. 따라서, 왼쪽 table이 n행이고 오른쪽 table이 m행이라면 n * m행의 table이 만들어지게 됩니다.
-- join 결과는 cartesia product 연산결과와 같습니다.
-- select [column 이름] from [table a 이름] cross join [table b 이름]
-- select [column 이름] from [table a 이름], [table b 이름]
select u.email, p.author, * from users u cross join posts p;
select u.email, p.author, * from users u, posts p;

-- * natural join
-- 왼쪽/오른쪽 table의 같은 이름을 가진 column을 join key로 table을 연결합니다.

-- * self join

-- [join 알고리즘]
-- * nested loop join
-- 선행 table: driving table
-- 후행 table: driven table
-- 선행 table을 기준으로 join 조건이 일치하는 후행 table의 행을 탐색/순회하며, 이를 선행 table 행만큼 반복합니다. (이중 for문과 유사합니다.)
-- index 기반이기에 random access가 발생합니다. 따라서, table이 커지면 시간이 오래걸리는 단점이 있습니다. 
-- 선행 table을 where로 줄이고 행이 적은것으로 선택하는게 좋습니다. (탐색 횟수를 줄일 수 있습니다.)
-- big o는 n2입니다.
-- for (...) { // driving
--   for (...) // driven
-- }

-- * sort merge join
-- 선행 table: left table / driving table
-- 후행 table: right table / driven table
-- 선행 table과 후행 table을 join key 기준으로 정렬한 뒤, 선행 table에서 순차적으로 join 조건이 일치하는 후행 table의 행을 탐색/순회합니다.
-- 정렬을 해야하기 때문에, table이 크면 시간이 오래걸리는 단점이 있습니다.

-- * hash join
-- 선행 table: left table / driving table
-- 후행 table: right table / driven table
-- 선행 table의 join key로 hash table을 만듭니다. 후행 table은 같은 hash function을 통해 선행 table join key의 hash table과 같은지 비교하여 table을 연결하게 됩니다.
-- 선행 table로 hash table을 만들기 때문에, 작은 table로 선행 table을 두어야 합니다.
-- 동등 join만 연결할 수 있습니다.
-- big o는 n (n + n) 입니다.
