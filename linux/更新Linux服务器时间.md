# 更新Linux服务器时间

1、修改系统时区（不修改的话，你同步时间会发现总是不对）

 ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime  --这里我修改为了上海
2、安装ntpdate

yum -y install ntpdate
3、更新时间

ntpdate ntp1.aliyun.com   --这里使用的阿里服务器，其余的可以百度ntp服务器就有了
4、将时间同步到BIOS里面，这样下次启动时，就会自动更新了

clock -w
————————————————
版权声明：本文为CSDN博主「zhaoxc」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/zhaoxiaochun1/article/details/122882837



# Linux 重启之后时间重置的解决办法



date -s 12/20/2003

date -s 12:30:00

clock -w 写入BIOS

有些系统是hwclock --systohc

总之是hwclock命令

hwclock -r显示bios时间



# centos7修改时间和时区

设置时区同样, 在 CentOS 7 中, 引入了一个叫 timedatectl 的设置设置程序.

用法很简单:

```
*# timedatectl # 查看系统时间方面的各种状态*      Local time: 四 2014-12-25 10:52:10 CST  Universal time: 四 2014-12-25 02:52:10 UTC        RTC time: 四 2014-12-25 02:52:10        Timezone: Asia/Shanghai (CST, +0800)     NTP enabled: yes NTP synchronized: yes RTC in local TZ: no      DST active: n/a
# timedatectl list-timezones *# 列出所有时区*
# timedatectl set-local-rtc 1 *# 将硬件时钟调整为与本地时钟一致, 0 为设置为 UTC 时间*
# timedatectl set-timezone Asia/Shanghai *# 设置系统时区为上海*
```

其实不考虑各个发行版的差异化, 从更底层出发的话, 修改时间时区比想象中要简单:

```
# cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
```