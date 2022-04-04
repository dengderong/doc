
// --------------------------------对象--》》字符串-----------------------------------------------//

public class Student { 
    //姓名 
    private String name;
     //年龄 
     private String age;
      //住址 
      private String address;
      public String getName() { 
           return name;
     } 
     public void setName(String name) { 
         this.name = name; 
    } 
    public String getAge() { 
        return age;
     } 
     public void setAge(String age) { 
         this.age = age; 
        } 
     public String getAddress() { 
         return address; 
        } 
    public void setAddress(String address) { 
        this.address = address; 
    } 
    @Override public String toString() { 
        return "Student [name=" + name + ", age=" + age + ", address=" + address + "]"; 
    } 
}





public static void convertObject() { 
    Student stu=new Student();
     stu.setName("JSON"); 
     stu.setAge("23"); 
     stu.setAddress("北京市西城区"); 
     //1、使用JSONObject 
     JSONObject json = JSONObject.fromObject(stu); 
     //2、使用JSONArray 
     JSONArray array=JSONArray.fromObject(stu); 
     String strJson=json.toString(); 
     String strArray=array.toString(); 
     System.out.println("strJson:"+strJson); 
     System.out.println("strArray:"+strArray); 
}

strJson:{"address":"北京市西城区","age":"23","name":"JSON"}
strArray:[{"address":"北京市西城区","age":"23","name":"JSON"}]



// ------------------------------------字符串--》》对象-------------------------------------------//



public static void jsonStrToJava(){ 
    //定义两种不同格式的字符串 
    String objectStr="{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}"; 
    String arrayStr="[{\"name\":\"JSON\",\"age\":\"24\",\"address\":\"北京市西城区\"}]"; 
    //1、使用JSONObject 
    JSONObject jsonObject=JSONObject.fromObject(objectStr); 
    Student stu=(Student)JSONObject.toBean(jsonObject, Student.class); 
    //2、使用JSONArray 
    JSONArray jsonArray=JSONArray.fromObject(arrayStr); 
    //获得jsonArray的第一个元素 
    Object o=jsonArray.get(0);
    JSONObject jsonObject2=JSONObject.fromObject(o); 
    Student stu2=(Student)JSONObject.toBean(jsonObject2, Student.class); 
    System.out.println("stu:"+stu); System.out.println("stu2:"+stu2); 
}


stu:Student [name=JSON, age=24, address=北京市西城区]
stu2:Student [name=JSON, age=24, address=北京市西城区]