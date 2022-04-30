ip link
ip addr
ip rout
ip addr add
ip route add

dns
/etc/hosts
```
192.168.1.11 abc
```

nameserver
cat /etc/resolv.conf
```
nameserver 192.168.1.10
```

local이 dns보다 먼저임
cat /etc/nsswitch.conf

nslookup www.goole.command
local은 안찾고 dsn에 질의