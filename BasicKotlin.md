



* lateinit**在初始化定义控件名称或者其他时使用，控件的id在activity没有运行onCreate方法里的setContentView时是null，所以才需要用lateinit进行修饰

  ```
  //用lateinit代替下面一种写法，更好
  lateinit var diceImage : ImageView
  
  var diceImage : ImageView? = null
  ```

* **tools:src=""**用来当成占位符，tools属于设计时属性的，程序运行时将忽略

  ```
  android:src="@drawable/empty_dice" //**运行时显示的图**
  tools:src="@drawable/dice_1" //开发通过xml看到的图
  ```

* 创建项目时API版本说明

  //编译时可以使用的api最高版本，api28对应的是Android9.0
  **compileSdkVersion 28**
  //最小支持的api版本
  **minSdkVersion 26**
   //This value is the most recent API that you have tested your app against. In many cases this is the same value as compileSdkVersion.
   **targetSdkVersion 28**

* **关于矢量图**

  1. 用矢量图比png灵活，可以缩放任意大小。让安装包更小。
  2. (vector,svg),使用需要注意矢量图用**在API版本21以上没有问题，但是低于21时会生成对应的png图**
  3. 为了避免低版本生成png图，可以通过属性进行设置：可以vectorDrawables.useSupportLibrary = true通过build.gradle文件中的配置参数指定将     Android支持库用于旧版API中的矢量可绘制对象。  为矢量可绘制对象启用支持库后，请使用元素中的**app:srcCompat**属性<ImageView>（而不是android:src）为该图像指定矢量可绘制源。

* 布局：textview完全可以设置一个**style统一格式**，可以通过Right-click the `TextView` in the **Component Tree** and select **Refactor > Extract Style**.一键生成已经定于好的属性
* android:layout_marginStart和android:layout_marginEnd是指绘制流程的开始和结束，left、right不太一样样。**API17(Android4.2)**是一个分界点，高于他start==left，低于它不行。
* textview***字体修改***使用**fontFamily**属性，例如：android:fontFamily="@font/abhaya_libre_bold"

