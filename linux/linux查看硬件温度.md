# centos7查看硬件温度

lm_sensors，是一款基于linux系统的硬件监控的软件。可以监控主板，CPU的工作电压，风扇转速，温度等数据。

一、安装lm_sensors软件
yum -y install lm_sensors
二、传感器检测
sensors-detect
全部输入yes

三、查看硬件温度
sensors
————————————————
版权声明：本文为CSDN博主「现实、太残忍」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/sumengnan/article/details/125018932