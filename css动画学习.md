# css动画学习

##### 1.animation(动画):   name duration timing-function delay iteration-count direction play-state fill-mode;

| 值              | 描述                                                         |
| --------------- | ------------------------------------------------------------ |
| name            | 用来调用 @keyframes 定义好的动画，与 @keyframes 定义的动画名称一致 |
| duration        | 指定元素播放动画所持续的时间                                 |
| timing-function | 规定速度效果的速度曲线，是针对每一个小动画所在时间范围的变换速率 |
| delay           | 定义在浏览器开始执行动画之前等待的时间，值整个 animation 执行之前等待的时间 |
| iteration-count | 定义动画的播放次数，可选具体次数或者无限 (infinite)          |
| direction       | 设置动画播放方向：normal(按时间轴顺序),reverse(时间轴反方向运行),alternate(轮流，即来回往复进行),alternate-reverse(动画先反运行再正方向运行，并持续交替运行) |
| play-state      | 控制元素动画的播放状态，通过此来控制动画的暂停和继续，两个值：running(继续)，paused(暂停) |
| fill-mode       | 控制动画结束后，元素的样式，有四个值：none(回到动画没开始时的状态)，forwards(动画结束后动画停留在结束状态)，backwords(动画回到第一帧的状态)，both(根据 animation-direction 轮流应用 forwards 和 backwards 规则)，注意与 iteration-count 不要冲突 (动画执行无限次) |



##### 2.transtion(过渡): property duration timing-function delay;

| 值                         | 描述                              |
| -------------------------- | --------------------------------- |
| transition-property        | 规定设置过渡效果的 CSS 属性的名称 |
| transition-duration        | 规定完成过渡效果需要多少秒或毫秒  |
| transition-timing-function | 规定速度效果的速度曲线            |
| transition-delay           | 定义过渡效果何时开始              |



##### 3.transform(变形)



##### 4.translate(移动)