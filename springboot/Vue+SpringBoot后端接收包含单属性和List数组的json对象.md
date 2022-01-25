## [Vue+SpringBoot后端接收包含单属性和List数组的json对象](https://www.cnblogs.com/wangsongbai/p/11248183.html)





这次主要是针对springboot后台接收的json中包含多对象（如List数组/单属性）所写的一篇文章。虽然网上类似情况很多，尝试了一个晚上，都没有解决问题，最后还是在师兄的帮助下完美解决。

vue前端代码
SysAddManual.vue

var Params = {
type: "typeA",
title: "titleA",
authors: [{name:"upxuan", age:"18"}, {name:"susen", age:"18"}]
}
console.log(Params)
this.$ajax({
url: '/api/manualAdd',
method: 'post',
contentType: "application/json; charset=utf-8",
dataType: "json",
data: Params
}).then( res => {
console.log(res)
})
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
manualAddController.java

@RequestMapping("/manualAdd")
@ResponseBody
public String AddManualJpaper (@RequestBody RequestManualAddData data) {
System.out.println("User:" + data.getType() + "," + data.getTitle());
System.out.println("Authors:" + data.getAuthors().get(0).getName() + "," + data.getAuthors().get(0).getAge());
return "Get it";
}
1
2
3
4
5
6
7
接收的数据对象类
RequestManualAddData .java

private String type;
private String title;
private List<AuthorsModel> authors;

public String getType() {
return type;
}

public void setType(String type) {
this.type = type;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}
public List<AuthorsModel> getAuthors() {
return authors;
}

public void setAuthors(List<AuthorsModel> authors) {
this.authors = authors;
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
作者对象类
AuthorsModel.java

private String name;
private int age;
public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}

public void setAge(int age) {
this.age = age;
}
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
后端打印出前端发送的数据，最后前端返回的结果如图:
\---------------------