## [JAVA中 如何产生一个特定范围的随机数](https://www.cnblogs.com/jxyblog/p/6228369.html)

```
生成0－2之间的随机数，包括2
Random rand = new Random();
int randNum = rand.nextInt(3);
生成5－26之间的随机数，包括26
int randNum = rand.nextInt(22)+5;
```