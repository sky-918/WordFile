#### RoomWordsSample Instruction

![7819453-b5e960ab219970ee](.\asset\7819453-b5e960ab219970ee.webp)

**Entity:** 当使用架构组件时，Entity是描述数据库表的类，这个类通常使用注解。

**SQLite database:** SQLite是一个数据库，存储数据。为了简单起见，忽略其他的存储工具（如web服务器等）。Room持久性库用于创建和维护数据库。

**DAO:**即数据访问对象。之前使用 [`SQLite``OpenHelper`]类定义这些内容。当使用DAO时，我们可以调用方法，room做其余的操作。

**Room database:**SQLite数据库之上的数据库层，负责处理以前使用SQLiteOpenHelper处理的普通任务。Room数据库使用DAO查询SQLite数据库。

**Repository:** Repository是用于管理多个数据资源，例如数据库，网络等。

**ViewModel\**\**:**  为UI提供数据。ViewModel作为Repository和UI的通信中心。ViewModel在数据配置更改后仍然存在。

**LiveData\**\**:**  LiveData是可以被观察到的数据持有类。它里面缓存或持有了最新的数据。当数据改变时会通知它的观察者。LiveData是可以感知生命周期的。UI组件只是观察相关数据，不会停止或恢复观察。 LiveData自动管理所有这些，因为它在观察时意识到相关的生命周期状态变化。







