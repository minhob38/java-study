-- *** [null] ***
-- null은 정의되지 않은 값입니다.
-- null은 0, 빈문자열이 아닙니다.

-- [null 연산]
-- null은 어떠한 연산을 해도 null을 반환합니다.
select null = null;
select null != null;
select null + 3;
select null - 3;
select null / 3;
select null * 3;

-- [null 함수]
-- * coalesce
-- null이 아닌 첫번째 인자를 반환합니다.
select coalesce(null, null, 3, 5);

-- * nullif
-- 첫번째 인자와 두번째 인자과 같으면, null을 반환합니다.
-- 첫번째 인자와 두번째 인자가 다르면, 첫번째 인자를 반환합니다.
select nullif(3, 3);
select nullif(3, 5);