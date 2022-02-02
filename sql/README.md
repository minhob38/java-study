# SQL

sql(postgresql)을 정리한 저장소로, sql keyword를 기준으로 정리되어 있습니다.

## 환경

### • docker database

docker를 기반으로 postgresql database를 올립니다.

\- database 올리기

```
$ sh db-up.sh
```

📝 port5435에서 실행됩니다.

\- database 내리기

```
$ sh db-down.sh
```

### • sample database

sample database로 northwind database를 사용합니다.

<img src="https://blog.yugabyte.com/wp-content/uploads/2019/07/northwind_distributedsql-06.png" alt="erd">
