# centos 7 firewall(防火墙)开放端口/删除端口/查看端口

2019-05-08阅读 3.5K0

centos 7 firewall(防火墙)开放端口/删除端口/查看端口  1.firewall的基本启动/停止/重启命令

```javascript
 #centos7启动防火墙
systemctl start firewalld.service
#centos7停止防火墙/关闭防火墙
systemctl stop firewalld.service
#centos7重启防火墙
systemctl restart firewalld.service


#设置开机启用防火墙
systemctl enable firewalld.service
#设置开机不启动防火墙
systemctl disable firewalld.service
```

复制

2.新增开放一个端口号

```javascript
 firewall-cmd --zone=public --add-port=80/tcp --permanent
#说明:
#–zone #作用域
#–add-port=80/tcp #添加端口，格式为：端口/通讯协议
#–permanent 永久生效，没有此参数重启后失效

#多个端口:
firewall-cmd --zone=public --add-port=80-90/tcp --permanent
```

复制



 **注意:新增/删除操作需要重启防火墙服务.** **其他PC telnet开放的端口必须保证本地 telnet 127.0.0.1 端口号 能通。本地不通不一定是防火墙的问题。**  **查看本机已经启用的监听端口:**

```javascript
 #centos7以下使用netstat -ant,7使用ss
ss -ant
```

复制



 3.查看

```javascript
 #centos7查看防火墙所有信息
firewall-cmd --list-all
#centos7查看防火墙开放的端口信息
firewall-cmd --list-ports
```

复制



 4.删除

```javascript
#删除
firewall-cmd --zone=public --remove-port=80/tcp --permanent
```







1.查看防火墙状态

查看防火墙状态 systemctl status firewalld

开启防火墙 systemctl start firewalld

关闭防火墙 systemctl stop firewalld

开启防火墙 service firewalld start

若遇到无法开启

先用：systemctl unmask firewalld.service

然后：systemctl start firewalld.service

2.查看对外开放的端口状态

查询已开放的端口 netstat -ntulp | grep 端口号：可以具体查看某一个端口号

查询指定端口是否已开 firewall-cmd --query-port=666/tcp

提示 yes，表示开启；no表示未开启。

3.对外开发端口查看想开的端口是否已开：firewall-cmd --query-port=6379/tcp

添加指定需要开放的端口：firewall-cmd --add-port=123/tcp --permanent

重载入添加的端口：firewall-cmd --reload

查询指定端口是否开启成功：firewall-cmd --query-port=123/tcp

移除指定端口：firewall-cmd --permanent --remove-port=123/tcp