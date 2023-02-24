Linux安装Redis
注：希望将redis安装到此目录 /usr/local/redis
希望将安装包下载到此目录 /usr/local/src

###### 1.创建安装目录/usr/local/redis

mkdir /usr/local/redis 

###### 2.进入安装包目录

cd /usr/local/src


###### 3.进行下载安装包

```
wget http://download.redis.io/releases/redis-6.0.8.tar.gz
```

###### 4.进行解压

tar -xzvf redis-6.0.8.tar.gz

###### 5.进入redis-3.0.7此目录

cd redis-3.0.7 

###### 6.安装到指定目录中

make PREFIX=/usr/local/redis install 


###### 7.配置文件，拷贝redis.conf到安装目录下

cp redis.conf /usr/local/redis/bin/


###### 8.启动 ：进入安装目录/usr/local/redis/bin，运行启动命令

cd /usr/local/redis/bin
./redis-server /usr/local/redis/bin/redis.conf



###### 注：如果是服务器上面安装，一定记得在安全组中把6379端口打开



后台启动: **redis.conf**。将该配置文件中的**daemonize no**改为**daemonize yes**即可

设置密码: requirepass属性设置  requirepass rong456654

开启远程连接： 127.0.0.1  注释掉， protected-mode的值为no

设置日志文件模式:  logfile "/var/log/redis.log"

 关闭redis:  /usr/local/redis/bin/redis-cli  >  auth rong456654  > shutdown

开启redis:  /usr/local/redis/bin/redis-server  /usr/local/redis/bin/redis.conf



#### linux使用systemctl命令配置redis自启动

创建服务　　在/usr/lib/systemd/system下创建redisd.service文件，内容如下。/data/redis为redis安装目录路径。

```
[Unit]
Description=Redis
After=network.target

[Service]
Type=forking
ExecStart=/data/redis/bin/redis-server /data/redis/redis.conf
ExecReload=/data/redis/bin/redis-server -s reload
ExecStop=/data/redis/bin/redis-server -s stop
PrivateTmp=true

[Install]
WantedBy=multi-user.target
```

三、创建软链接与开机自启　　运行命令 systemctl enable redisd 即可自动创建软链接并添加开机自启。

四、相关命令　　

启动redis服务`systemctl start redisd`　　

重启redis服务`systemctl restart redisd`　　

停止redis服务`systemctl stop redisd`　　

添加开机自启`systemctl enable redisd`　　

禁止开机自启`systemctl disable redisd`　　

查看状态`systemctl status redisd`








