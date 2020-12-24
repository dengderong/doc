# js正则限制字符串长度_JavaScript 正则表达式

[weixin_39651488](https://blog.csdn.net/weixin_39651488) 2020-12-03 15:40:59 ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/articleReadEyes.png) 68 ![img](https://csdnimg.cn/release/blogv2/dist/pc/img/tobarCollect.png) 收藏

文章标签： [js正则限制字符串长度](https://so.csdn.net/so/search/s.do?q=js正则限制字符串长度&t=blog&o=vip&s=&l=&f=&viparticle=) [oracle 正则过滤特殊字符](https://www.csdn.net/tags/MtTaAgysMjIyODktYmxvZwO0O0OO0O0O.html)



![534ec0839546d5bc89843365cb7c127e.png](F:\doc\img\js正则\534ec0839546d5bc89843365cb7c127e.png)

js中正则表通常被用来检索、替换那些符合某个模式（规则）的文本，例如验证表单，过滤（替换）页面内容中的一些敏感词汇。

**1.1什么是正则表达式**

正则表达式（ Regular Expression ）是用于匹配字符串中字符组合的模式。在JavaScript中，**正则表达式也是对象**。

**1.2 正则表达式的特点**

1. 灵活性、逻辑性和功能性非常的强。
2. 可以迅速地用极简单的方式达到字符串的复杂控制。
3. 对于刚接触的人来说，比较晦涩难懂。比如：^w+([-+.]w+)*@w+([-.]w+)*.w+([-.]w+)*$
4. 实际开发,一般都是直接复制写好的正则表达式. 但是要求会使用正则表达式并且根据实际情况修改正则表达式. 比如用户名: /^[a-z0-9_-]{3,16}$/

## **2.正则表达式在js中的使用**

### **2.1正则表达式的创建**

在 JavaScript 中，可以通过两种方式创建一个正则表达式。

方式一：通过调用RegExp对象的构造函数创建

```
var exp = new RegExp(/123/);console.log(exp);输出  /123/
```

方式二：利用字面量创建 正则表达式

```
var rg = /123/;输出 /123/
```

**2.2测试正则表达式**

test() 正则对象方法，用于检测字符串是否符合该规则，该对象会返回 true 或 false，其参数是**测试字符串**。

```
var rg = /123/;console.log(rg.test(123));//匹配字符中是否出现123  出现结果为trueconsole.log(rg.test('abc'));//匹配字符中是否出现123 未出现结果为falseconsole.log(rg.test('1234'));匹配字符中是否出现123  出现结果为true
```

## **3.正则表达式中的特殊字符**

**3.1正则表达式的组成**

一个正则表达式可以由简单的字符构成，比如 /abc/，也可以是简单和特殊字符的组合，比如 /ab*c/ 。其中特殊字符也被称为元字符，在正则表达式中是具有特殊意义的专用符号，如 ^ 、$ 、+ 等。

特殊字符非常多，可以参考：

MDNdeveloper.mozilla.org

![6be3d3fe05b6d424f8460bd0d70f9281.png](F:\doc\img\js正则\6be3d3fe05b6d424f8460bd0d70f9281.png)

jQuery 手册：正则表达式部分

正则测试工具 http://tool.oschina.net/regex

**3.2边界符**

正则表达式中的边界符（位置符）用来提示字符所处的位置，主要有两个字符



![c4095aa0f3f65bff3e52043f567e257b.png](https://img-blog.csdnimg.cn/img_convert/c4095aa0f3f65bff3e52043f567e257b.png)

如果 ^和 $ 在一起，表示必须是精确匹配。

```
var rg = /abc/; // 正则表达式里面不需要加引号 不管是数字型还是字符串型// /abc/ console.log(rg.test('abc'));//trueconsole.log(rg.test('abcd'));//trueconsole.log(rg.test('aabcd'));//true只要包含有abc这个字符串返回的都是true  var reg = /^abc/;console.log(reg.test('abc')); // trueconsole.log(reg.test('abcd')); // trueconsole.log(reg.test('aabcd')); // false注意这里^ 如果有两个，第二个就表示取反！  var reg1 = /^abc$/; // 精确匹配 要求必须是 abc字符串才符合规范console.log(reg1.test('abc')); // trueconsole.log(reg1.test('abcd')); // falseconsole.log(reg1.test('aabcd')); // falseconsole.log(reg1.test('abcabc')); // false
```

**3.3字符类**

字符类表示有一系列字符可供选择，只要匹配其中一个就可以了。所有可供选择的字符都放在方括号内。

3.3.1 [] 方括号

表示有一系列字符可供选择，只要匹配其中一个就可以了

```
var rg = /[abc]/; // 只要包含有a 或者 包含有b 或者包含有c 都返回为trueconsole.log(rg.test('andy'));//trueconsole.log(rg.test('baby'));//trueconsole.log(rg.test('color'));//trueconsole.log(rg.test('red'));//false[ ] 这里可以理解为[ a || b ||c ] var rg1 = /^[abc]$/; // 三选一 只有是a 或者是 b  或者是c 这三个字母才返回 trueconsole.log(rg1.test('aa'));//falseconsole.log(rg1.test('a'));//trueconsole.log(rg1.test('b'));//trueconsole.log(rg1.test('c'));//trueconsole.log(rg1.test('abc'));//falseconsole.log(rg1.test('ab'));//false var reg = /^[a-z]$/ //26个英文字母任何一个字母返回 true  - 表示的是a 到z 的范围  console.log(reg.test('a'));//trueconsole.log(reg.test('z'));//trueconsole.log(reg.test('A'));//false //字符组合var reg1 = /^[a-zA-Z0-9]$/; // 26个英文字母(大写和小写都可以)任何一个字母返回 true  console.log(reg1.test('a'));//trueconsole.log(reg1.test('B'));//trueconsole.log(reg1.test(8));//trueconsole.log(reg1.test('!'));//false  //取反 方括号内部加上 ^ 表示取反，只要包含方括号内的字符，都返回 false 。var reg2 = /^[^a-zA-Z0-9]$/;console.log(reg2.test('a'));//falseconsole.log(reg2.test('B'));//falseconsole.log(reg2.test(8));//falseconsole.log(reg2.test('!'));//true
```

3.3.2量词符

量词符用来设定某个模式出现的次数。



![b2adaecaa2569d7e8d1453db10b93726.png](F:\doc\img\js正则\b2adaecaa2569d7e8d1453db10b93726.png)

3.3.3用户名表单验证(案例）



![6309bb2fd8cc7ac3b86eec58da0282ff.png](F:\doc\img\js正则\6309bb2fd8cc7ac3b86eec58da0282ff.png)

功能需求:

1. 如果用户名输入合法, 则后面提示信息为: 用户名合法,并且颜色为绿色
2. 如果用户名输入不合法, 则后面提示信息为: 用户名不符合规范, 并且颜色为红色

思路分析：

用户名只能为英文字母,数字,下划线或者短横线组成, 并且用户名长度为6~16位.

当表单失去焦点就开始验证.

如果符合正则规范, 则让后面的span标签添加 字体颜色为绿色.

如果符合正则规范, 则让后面的span标签添加 字体颜色为红色.

```
<input type="text" class="uname"> <span>请输入用户名</span>var reg = /^[a-zA-Z0-9_-]{6,16}$/  var uname = document.querySslector(".uname");var span = document.querySelector("span");uname.onblur = function() {            if (reg.test(this.value)) {                console.log('正确的');                span.className = 'right';                span.innerHTML = '用户名格式输入正确';            } else {                console.log('错误的');                span.className = 'wrong';                span.innerHTML = '用户名格式输入不正确';            }        }
```

> /这个模式用户只能输入英文字母 数字 下划线 短横线但是有边界符和[] 这就限定了只能多选1

3.3.4 括号总结

1.大括号 量词符. 里面表示重复次数

2.中括号 字符集合。匹配方括号中的任意字符.

3.小括号表示优先级

**3.4预定义类**

预定义类指的是某些常见模式的简写方式.



![d2e9cf207652e6d0917d620e24dd80ab.png](F:\doc\img\js正则\d2e9cf207652e6d0917d620e24dd80ab.png)

**3.5正则替换replace**

replace() 方法可以实现替换字符串操作，用来替换的参数可以是一个字符串或是一个正则表达式。

```
var str = 'andy和red';var newStr = str.replace('andy', 'baby');console.log(newStr)//baby和red//等同于 此处的andy可以写在正则表达式内var newStr2 = str.replace(/andy/, 'baby');console.log(newStr2)//baby和red //全部替换var str = 'abcabc'var nStr = str.replace(/a/,'哈哈')console.log(nStr) //哈哈bcabc//全部替换gvar nStr = str.replace(/a/g,'哈哈')console.log(nStr) //哈哈bc哈哈bc //忽略大小写ivar str = 'aAbcAba';var newStr = str.replace(/a/gi,'哈哈')//"哈哈哈哈bc哈哈b哈哈"
```

**案例:过滤敏感词汇**

```
<textarea name="" id="message"></textarea> <button>提交</button><div></div><script>    var text = document.querySelector('textarea');    var btn = document.querySelector('button');    var div = document.querySelector('div');    btn.onclick = function() {    	div.innerHTML = text.value.replace(/激情|gay/g, '**');    }</script>
```

## 拓展

**JavaScript split() 方法**

```
var str = 'name=ifer&age=18';        console.log(str.split(/&|=/));        console.log(str.split(/&/));//split() 方法用于把一个字符串分割成字符串数组。    /* var arr = str.split('&')        for(var i = 0;i < arr.length; i ++) {            var key = arr[i].split('=')[0]            var value = arr[i].split('=')[1]            console.log(key, value)        } */
```



![2059f6810dd093cba98f905e1a2d76a9.png](F:\doc\img\js正则\2059f6810dd093cba98f905e1a2d76a9.png)



原文:https://blog.csdn.net/weixin_39651488/article/details/110800320