# Repository

| **Caching technique**                                        | **Uses**                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| [`Retrofit`](http://square.github.io/retrofit/) is a networking library used to implement a type-safe REST client for Android. You can configure Retrofit to store a copy of every network result locally. | Good solution for simple requests and responses, infrequent network calls, or small datasets. |
| You can use `SharedPreferences` to store key-value pairs.    | Good solution for a small number of keys and simple values. You can't use this technique to store large amounts of structured data. |
| You can access the app's internal storage directory and save data files in it. Your app's package name specifies the app's internal storage directory, which is in a special location in the Android file system. This directory is private to your app, and it is cleared when your app is uninstalled. | Good solution if you have specific needs that a file system can solve—for example, if you need to save media files or data files and you have to manage the files yourself. You can't use this technique to store complex and structured data. |
| You can cache data using [`Room`](https://developer.android.com/topic/libraries/architecture/room), which is an SQLite object-mapping library that provides an abstraction layer over SQLite. | Recommended solution for complex and structured data, because the best way to store structured data on a device's file system is in a local SQLite database. |

**Key concept:** Don't retrieve data from the network every time the app is launched. Instead, display data that you fetch from the database. This technique decreases app-loading time.

![repository9_1](.\asset\repository9_1.png)

## The repository pattern

The *repository pattern* is a design pattern that isolates data sources from the rest of the app.(仓库模式，将数据源和app其余部分分隔开)

A *repository* mediates between data sources (such as persistent models, web services, and caches) and the rest of the app. The diagram below shows how app components such as activities that use `LiveData` might interact with data sources by way of a repository.

![repostory9_2](.\asset\repostory9_2.png)

看图理解，数据的中心是**Repository**,他提供提供API让来自网络的数据存储，让ViewModel读取数据，进而让view显示





**详情代码查看Demo--DevBytes**