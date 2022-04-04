## List转JSONArray和JSONArray转List



**1.List转JSONArray**

List<T> list = new ArrayList<T>();
JSONArray array= JSONArray.parseArray(JSON.toJSONString(list))；



**2.JSONArray转List**

JSONArray array = new JSONArray();
List<EventColAttr> list = JSONObject.parseArray(array.toJSONString(), EventColAttr.class);



**3.String转JSONArray**

String st = "[{name:Tim,age:25,sex:male},{name:Tom,age:28,sex:male},{name:Lily,age:15,sex:female}]";
JSONArray tableData = JSONArray.parseArray(st);

