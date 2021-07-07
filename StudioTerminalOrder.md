### adb Order

* adb start-server //开启PC端的adb server

* adb kill-server //关闭PC端的adb server

* adb connect 192.168.1.5:5555 //连接手机(5555是手机开放的端口号，可省略）
  ，如果连接成功会进行相关的提示，此时在电脑上可以输入adb相关的命令进行调试该手机，如果失败的话，可以先kill-server命令，然后重试连接。
  
* adb disconnect 192.168.1.5:5555 //调试结束，断开手机连接。

* adb devices //显示当前运行的全部模拟器

* adb shell pm list packages //列出手机上所有安装的应用包名

* ```
  adb shell am kill com.example.android.dessertclicker//结束这个（包名）进程
  ```

* adb install *.apk //adb安装apk

* adb -s <设备编号> install *.apk //多个设备时，指定某设备安装应用。

* adb uninstall apk的包名 //adb卸载apk。

* adb push <本地路径> <远程路径> //从本地向设备中添加文件

* adb push <远程路径> <本地路径> //从设备上拷贝文件到本地
  adb help //显示帮助信息
  
* adb shell //进入设备的data目录

* exit //退出adb shell

* tap:有些时候通过命令行安装某个应用时，默认是不启动这个应用的，我们可以使用如下命令启动该应用：

​       $ adb shell
​       $ am start -n {应用包名}/{应用启动页全路径}

### Gradle Order

* **Terminal输入命令gradle和gradlew的区别**

  gradlew即gradle wrapper,是google推荐的build方式。每个项目都有一个特定版本的gradle用于构建此项目，但是并不是所有的项目都用一个版本，也有可能某个项目所用的gradle版本电脑上并没有下载，这样如果在本地配置gradle，需要配置太多个，太麻烦。在项目gradlew里面配置项目所需要的gradle版本，然后用户只需要运行gradlew（第一次运行）就可以按照配置下载对应的gradle到项目的目录中，仅仅给项目本身用，然后就可以用gradlew命令执行clean、build等操作，和gradle命令一样，太方便了。其实说白了gradlew就相当于gradle的包装。

* **Gradle常用的命令**

  * gradlew -v //版本号
  * gradlew clean //清除app目录下的build文件夹
  * gradlew build //检查依赖并编译打包
  * gradlew assembleDebug //编译并打Debug包
  * gradlew assembleRelease //编译并打Release的包
  * gradlew installRelease //Release模式打包并安装
  * gradlew uninstallRelease //卸载Release模式包
  * gradlew compileDebugJavaWithJavac --stacktrace  //找错
  * gradlew processDebugResources --debug //未知
  
  

scrcpy

#### Flutter 

- source ~/.bash_profile 使命令生效

- flutter --version

- To see a full list of available changes, run the following command:

  *content_copy*

  ```
  dart fix --dry-run
  ```

- To apply all changes in bulk, run the following command:

  *content_copy*

  ```
  dart fix --apply
  ```

Mac 终端：

结束执行的命令： control+c。   查看命令： control+x
