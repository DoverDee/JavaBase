# 命令模式(Command pattern)

+ Class designed in this base directory is abstract illustration.  
+ Class designed in sample* package is concrete illustration.

# 在命令模式结构图中包含如下几个角色：
+ Command（抽象命令类）：抽象命令类一般是一个抽象类或接口，在其中声明了用于执行请求的execute()等方法，通过这些方法可以调用请求接收者的相关操作。
+ CommandConcrete*（具体命令类）：具体命令类是抽象命令类的子类，实现了在抽象命令类中声明的方法，它对应具体的接收者对象，将接收者对象的动作绑定其中。在实现execute()方法时，将调用接收者对象的相关操作(Action)。
+ Invoker（调用者）：调用者即请求发送者，它通过命令对象来执行请求。一个调用者并不需要在设计时确定其接收者，因此它只与抽象命令类之间存在关联关系。在程序运行时可以将一个具体命令对象注入其中，再调用具体命令对象的execute()方法，从而实现间接调用请求接收者的相关操作。
+ Handler（接收者）：接收者执行与请求相关的操作，它具体实现对请求的业务处理。
+ 每一个具体命令类对应一个请求的处理者（接收者），通过向请求发送者注入不同的具体命令对象可以使得相同的发送者对应不同的接收者，从而实现“将一个请求封装为一个对象，用不同的请求对客户进行参数化”，客户端只需要将具体命令对象作为参数注入请求发送者，无须直接操作请求的接收者。

#### 有时候我们需要将多个请求排队，当一个请求发送者发送一个请求时，将不止一个请求接收者产生响应，这些请求接收者将逐个执行业务方法，完成对请求的处理。此时，我们可以通过命令队列来实现。
+ InvokerWithCommandQueue：请求发送者类InvokerWithCommandQueue将针对CommandQueue编程。
+ CommandQueue：负责存储多个命令对象。
+ 我们可以将命令对象通过序列化写到日志文件中，此时命令类必须实现java.io.Serializable接口。

# 所有类
1. Client
2. Invoker
3. Command
4. CommandConcreteA
5. CommandConcreteB
6. Handler
7. InvokerWithCommandQueue
8. CommandQueue
