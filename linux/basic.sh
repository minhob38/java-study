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

# [file]
# * touch
# * cp
# * vi

# [redirect]

# [pipe]

# [id]
# * su
# switch user로 계정을 바꿉니다.
# - su [계정 이름] - 계정 이름을 지정하지 않으면 root로 바꿉니다.
su
su minho

# * exit
# - 이전 계정으로 돌아갑니다.
exit

# * passwd
# 비밀번호를 바꿉니다.
# - passwd [계정 id]
passwd minho
sudo passwd root

# * hostanme
# 현재 hostname을 보여줍니다.
hostname

# * set-hostanme
# hostname을 설정합니다.
hostname [host 이름]
hostnamectl

vim /etc/hosts# 

# [network]
# * ping
# 해당 ip/domain에 신호를 보내, 해당 network에 access가 가능한지 확인합니다.
# - ping -c [요청수] -i [간격(sec)] [ip 또는 domain]
# <설치>
# sudo apt update
# sudo apt install iputils-ping
ping -c 5 -i 3 www.google.com

# * curl
# 해당 ip/domain에 웹요청을 보내고 응답을 받습니다.
# - curl -c [요청수] -i [간격(sec)] [ip 또는 domain]
# <설치>
# sudo apt update
# sudo apt install curl
ping -c 5 -i 3 www.google.com

# [vim]
# * i : insert (입력할 수 있는 상태로 바꿉니다.)
# * :w : 작성한 내용을 저장합니다.