CURDIR=`dirname $0`

docker-compose -f $CURDIR/docker-database/docker-compose.database.yml up -d

# 조회
# 조건
# 삭제
# 수정
# join
# index
# partition
# sql optimization