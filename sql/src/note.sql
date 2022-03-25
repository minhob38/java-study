-- * null 수 계산하기
select a, count(*) - count(b) from t group by a