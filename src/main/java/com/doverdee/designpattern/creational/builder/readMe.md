# 建造者模式(Builder Pattern)

+ Class designed in this base directory is abstract illustration.
+ Class designed in sample* package is concrete illustration.

# 在建造者模式结构图中包含如下几个角色：
+ Builder（抽象建造者）：它为创建一个产品Product对象的各个部件指定抽象接口，在该接口中一般声明两类方法，一类方法是buildPartX()，它们用于创建复杂对象的各个部件；另一类方法是concreteProduct()，它们用于返回复杂对象。Builder既可以是抽象类，也可以是接口。
+ BuildProduct*（具体建造者）：它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象。
+ ProductWithManyField（产品角色）：它是被构建的复杂对象，包含多个组成部件，具体建造者创建该产品的内部表示并定义它的装配过程。
+ Director（指挥者）：指挥者又称为导演类，它负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系，可以在其construct()建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造。客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，并实例化具体建造者对象（也可以通过配置文件和反射机制），然后通过指挥者类的构造函数或者Setter方法将该对象传入指挥者类中。

# 省略Director
+ 在有些情况下，为了简化系统结构，可以将Director和抽象建造者Builder进行合并，在Builder中提供逐步构建复杂产品对象的concreteProduct()方法。由于Builder类通常为抽象类，因此可以将concreteProduct()方法定义为静态(static)方法。

# 钩子方法的引入
+ 建造者模式除了逐步构建一个复杂产品对象外，还可以通过Director类来更加精细地控制产品的创建过程，例如增加一类称之为钩子方法(HookMethod)的特殊方法来控制是否对某个buildPartX()的调用。
+ 钩子方法的返回类型通常为boolean类型，方法名一般为isXXX()，钩子方法定义在抽象建造者类中。
       
# 所有类
1. Client
2. Director
3. Builder
4. BuildProductA
5. BuildProductB
6. ProductWithManyField
7. ObjectField
