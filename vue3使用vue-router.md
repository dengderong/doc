## vue3使用vue-router

#### 	vue3+cli4+router4

![1607780772026](F:\doc\img\vue3使用vue-router\1607780772026.png)

1. ###### 安装 vue-router@next  【先尝试不安装core-js】

2. ###### 打开main.js

   vue3和vue2对比图![img](F:\doc\img\vue3使用vue-router\webp) 

   

   ###### 3.在src文件下创建route文件夹下再创建index.js文件

   ###### 4.打开index.js文件，引入router

   `import { createRouter,createWebHashHistory} from "vue-router";`

    这里我们使用`hash`模式 需要`history`模式的同学请点击这[路由模式](https://next.router.vuejs.org/guide/essentials/history-mode.html#hash-mode) 

   ###### 5.为方便演示在src文件下创建两个页面

   ![1607782251497](F:\doc\img\vue3使用vue-router\1607782251497.png)

   

   

   ###### 6.打开route文件夹下的index.js ，导入组件和添加routes和导出路由

   ```vue
   const home = () => import("../home")
   const login = () => import("../login")
   
   const routes = [
     { path: "/", redirect: "/home" },
     {
       path: "/home",
       name: "home",
       component: home
     },
     {
       path: "/login",
       name: "login",
       component: login
     }
   ]
   export const router = createRouter({
     history: createWebHashHistory(),
     routes: routes
   })
   ```

   ###### 7.新建App.vue，等下在mian.js里面需要导入进去的根组件(暂时编辑如下)

   ![1607783149598](F:\doc\img\vue3使用vue-router\1607783149598.png)

   ###### 8.打开main.js

   ​	（1）按需导入createApp

   ​	（2）导入根组件

   ​	（3)  导入router