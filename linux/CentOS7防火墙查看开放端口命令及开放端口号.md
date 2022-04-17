**1. 查看已开放的端口**

```
firewall-cmd --list-ports
```

**2. 开放单个端口**（开放后需要要重启防火墙才生效）

```
firewall-cmd --zone=public --add-port=8080/tcp --permanent
```

***\*3. 开放多个端口\****（开放后需要要重启防火墙才生效）

```
firewall-cmd --zone=public --add-port=20000-29999/tcp --permanent
```

**（--permanent 为永久生效，不加为单次有效（重启失效））**

**4. 关闭端口**（关闭后需要要重启防火墙才生效）

```
firewall-cmd --zone=public --remove-port=8080/tcp --permanent
```

***\*5. 查看端口是否打开\****

```
firewall-cmd --zone= public --query-port=80/tcp
```

**6. 查看防火墙状态（两种方式）**

```
firewall-cmd --state
```

**![img](https://img2020.cnblogs.com/blog/2107107/202008/2107107-20200831095859117-1962921566.png)**

```
systemctl status firewalld
```

![img](https://img2020.cnblogs.com/blog/2107107/202008/2107107-20200831100020896-1753571000.png)

**7. 开启防火墙**

```
systemctl start firewalld
```

**8. 重启防火墙 (\**两种方式）\****

```
firewall-cmd --reload
```

![img](https://img2020.cnblogs.com/blog/2107107/202008/2107107-20200831100212984-258517840.png)

```
systemctl restart firewalld
```

![img](https://img2020.cnblogs.com/blog/2107107/202008/2107107-20200831100229928-81237544.png)

**9. 设置开机启动防火墙**

```
systemctl enable firewalld
```

**10. 查看防火墙设置开机自启是否成功**

```
systemctl is-enabled firewalld;echo $?
```

**11. 禁止防火墙开机启动**

```
systemctl disable firewalld
```

**12. 停止防火墙**

```
systemctl stop firewalld
```