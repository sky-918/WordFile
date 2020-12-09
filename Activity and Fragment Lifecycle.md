#### Activity and Fragment Lifecycle



* Activity的生命周期，注意onRestart运行的时机（oncreate之后，从stop状态变为resumed时会运行Restart）,

<img src=".\assets\activity_lifecycal.png" alt="activity_lifecycal" style="zoom:50%;" />



  * onSaveInstanceState()方法是在onStop之后执行，用来保存数据，恢复数据可以在onCreate或者onStart中
  * 直接返回首页，不会完全调用生命周期方法，但是会调用onSaveInstanceState,同时切换横竖屏（**这是属于更改配置，还有语言修改，插入硬件键盘**）相当于重新创建这个activity
  * adb shell am kill com.example.android.dessertclicker//结束这个（包名）进程可以帮助调试

* 看图说话，红色为Activity的生命周期,**Fragment的生命周期依附于Activity的生命周期，添加显示时activity准备好了，Fragment才能添加；消失时，刚好相反，Fragment 先detach然后activity才能destroy。**

<img src="assets\dfde69e6a42d54b3.png" alt="dfde69e6a42d54b3" style="zoom:50%;" />

* ### **Lifecycle library**使用非常方便绑定生命周期

  1. Implement the `LifecycleObserver` interface in classes that need to be lifecycle-aware（在需要的地方继承它）

  2. Initialize a lifecycle observer class with the lifecycle object from the activity or fragment.（在需要检测生命周期的地方初始化activity或者fragment）

  3. In the lifecycle observer class, annotate lifecycle-aware methods with the lifecycle state change they are interested in.For example, the `@OnLifecycleEvent(Lifecycle.Event.ON_START)`annotation indicates that the method is watching the `onStart` lifecycle event.（注解的方式，添加到生命周期中）

     