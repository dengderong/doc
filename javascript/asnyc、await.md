asnyc/await

1. asnyc封装了一个promise的对象 它的值返回在回调函数的resolve的回调参数里面

   它不会阻塞后面的代码执行

2. 如果添加了await，如果前面的是promise对象他会等待，如果不是他会它原来的执行

