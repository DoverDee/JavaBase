# 单例模式(Singleton Pattern)

+ Class designed in this base directory is abstract illustration.
+ Class designed in sample* package is concrete illustration.

# 单例模式结构图中只包含一个单例角色：
+ Singleton（单例）：在单例类的内部实现只生成一个实例，同时它提供一个静态的getInstance()工厂方法，让客户可以访问它的唯一实例；为了防止在外部对其实例化，将其构造函数设计为私有；在单例类内部定义了一个Singleton类型的静态对象，作为外部共享的唯一实例。

# 高并发下线程安全的单例有
1. 饿汉式单例-->EagerSingleton
2. 方法线程锁实现的懒汉式单例-->LazySingletonWithMethodSynchronized
3. 利用双重检查锁定(Double-Check Locking)实现的懒汉式单例-->LazySingletonWithStatementSynchronizedTwoValidation
4. 利用使用IoDH(Initialization on Demand Holder)静态内部类方式实现的懒汉式单例-->LazySingletonWithIoDH
#### 使用LazySingletonWithIoDH,我们既可以保证线程安全，又可以实现延迟加载，又不影响系统性能。不失为一种最好的Java语言单例模式实现方式。

# 所有类
1. EagerSingleton
2. LazySingleton
3. LazySingletonWithMethodSynchronized
4. LazySingletonWithStatementSynchronizedOneValidation
5. LazySingletonWithStatementSynchronizedTwoValidation
6. LazySingletonWithIoDH