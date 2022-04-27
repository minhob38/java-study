# *** [basic] ***
# [path]
# * cd
# 해당 path로 이동합니다.
# - cd /[path] : 절대경로로 이동합니다.
# - cd [path] : 상대경로로 이동합니다.
# - cd .. : 상위경로로 이동합니다.
cd /
cd ..
cd ~

# *** file ***
# * touch
# * cp
# * vi

# *** redirect ***

# *** pipe ***

# *** id ***
# [su]
# switch user로 계정을 바꿉니다.
# - su [계정 이름] - 계정 이름을 지정하지 않으면 root로 바꿉니다.
su
su minho

# [exit]
# - 이전 계정으로 돌아갑니다.
exit

# [passwd]
# 비밀번호를 바꿉니다.
# - passwd [계정 id]
passwd minho
sudo passwd root

# [hostanme]
# 현재 hostname을 보여줍니다.
hostname

# [set-hostanme]
# hostname을 설정합니다.
hostname [host 이름]
hostnamectl

vim /etc/hosts 

# *** network ***
# [ping]
# 해당 ip/domain에 신호를 보내, 해당 network에 access가 가능한지 확인합니다.
# - ping -c [요청수] -i [간격(sec)] [ip 또는 domain]
# <설치>
# sudo apt update
# sudo apt install iputils-ping
ping -c 5 -i 3 www.google.com

# [curl]
# 해당 ip/domain에 웹요청을 보내고 응답을 받습니다.
# - curl [ip 또는 domain]
# * d : post request data를 설정합니다.
# * X : http method를 정의합니다.
# * o : 응답을 output file로 저장합니다.
# * s : 실행결과를 보여주지 않습니다.
# <설치>
# sudo apt update
# sudo apt install curl
curl -X get 3 www.google.com

# [vim]
# editor입니다.
# - vim [file 이름]
# * i : insert (입력할 수 있는 상태로 바꿉니다.)
# * :w : 작성한 내용을 저장합니다.
# * dd : 한줄을 지웁니다.

# [ps]
# 현재 실행되고 있는 process 상태를 보여줍니다.
# * e : 모든 process를 보여줍니다.
# * f : full format으로 보여줍니다.
# * ㅣ : long format으로 보여줍니다.
# <설치>
# apt-get update
# apt-get install procps
ps -ef

# *** 도움말 ***
# [man]
# command의 설명을 보여줍니다.
# - man [command 이름]
man ping

# [whatis]
# command의 설명을 보여줍니다.
# - whatis [command 이름]
whatis ping

# [help]
# command의 설명을 보여줍니다.
# - [command 이름] --help
ping --help
