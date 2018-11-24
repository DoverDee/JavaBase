# 工厂方法模式(Factory Method Pattern)

+ Class designed in this base directory is abstract illustration.
+ Class designed in sample* package is concrete illustration.

# 在工厂方法模式结构图中包含如下几个角色：
+ Product（抽象产品）：它是定义产品的接口，是工厂方法模式所创建对象的超类型，也就是产品对象的公共父类。
+ ConcreteProduct（具体产品）：它实现了抽象产品接口，某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。
+ Factory（抽象工厂）：在抽象工厂类中，声明了工厂方法(Factory Method)，用于返回一个产品。抽象工厂是工厂方法模式的核心，所有创建对象的工厂类都必须实现该接口。
+ ConcreteFactory（具体工厂）：它是抽象工厂类的子类，实现了抽象工厂中定义的工厂方法，并可由客户端调用，返回一个具体产品类的实例。
+ 在抽象工厂中可以定义多个重载的工厂方法，在具体工厂中实现了这些工厂方法。这些方法可以包含不同的业务逻辑，以满足对不同产品对象的需求。

#### 与简单工厂模式相比，工厂方法模式最重要的区别是引入了抽象工厂角色，抽象工厂可以是接口，也可以是抽象类或者具体类。

# 所有类
1. Client
2. Factory
3. FactoryConcrete1
4. FactoryConcrete2
5. Product
6. ProductConcrete1
7. ProductConcrete2
