# [Java中short、int、long、float、double的取值范围](https://www.cnblogs.com/pangpanghuan/p/6418441.html)


一、基本数据类型的特点，位数，最大值和最小值。
1、
基本类型：short 二进制位数：16
包装类：java.lang.Short
最小值：Short.MIN_VALUE=-32768 （-2的15此方）
最大值：Short.MAX_VALUE=32767 （2的15次方-1）
2、
基本类型：int 二进制位数：32
包装类：java.lang.Integer
最小值：Integer.MIN_VALUE= -2147483648 （-2的31次方）
最大值：Integer.MAX_VALUE= 2147483647 （2的31次方-1）
3、
基本类型：long 二进制位数：64
包装类：java.lang.Long
最小值：Long.MIN_VALUE=-9223372036854775808 （-2的63次方）
最大值：Long.MAX_VALUE=9223372036854775807 （2的63次方-1）
4、
基本类型：float 二进制位数：32
包装类：java.lang.Float
最小值：Float.MIN_VALUE=1.4E-45 （2的-149次方）
最大值：Float.MAX_VALUE=3.4028235E38 （2的128次方-1）
5、
基本类型：double 二进制位数：64
包装类：java.lang.Double
最小值：Double.MIN_VALUE=4.9E-324 （2的-1074次方）
最大值：Double.MAX_VALUE=1.7976931348623157E308 （2的1024次方-1）

 

| 基本类型 | 字节数 | 位数  | 最大值                 | 最小值     |
| -------- | ------ | ----- | ---------------------- | ---------- |
| byte     | 1byte  | 8bit  | 2^7 - 1                | -2^7       |
| short    | 2byte  | 16bit | 2^15 - 1               | -2^15      |
| int      | 4byte  | 32bit | 2^31 - 1               | -2^31      |
| long     | 8byte  | 64bit | 2^63 - 1               | -2^63      |
| float    | 4byte  | 32bit | 3.4028235E38           | 1.4E - 45  |
| double   | 8byte  | 64bit | 1.7976931348623157E308 | 4.9E - 324 |
| char     | 2byte  | 16bit | 2^16 - 1               | 0          |