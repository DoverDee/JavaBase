# 抽象工厂模式(Abstract Factory Pattern)

+ Class designed in this base directory is abstract illustration.  
+ Class designed in sample* package is concrete illustration.

# 在抽象工厂模式结构图中包含如下几个角色：
+ Factory（抽象工厂）：它声明了一组用于创建一族产品的方法，每一个方法对应一种产品。
+ ConcreteFactory（具体工厂）：它实现了在抽象工厂中声明的创建产品的方法，生成一组具体产品，这些产品构成了一个产品族，每一个产品都属于某个产品类中。
+ Product（抽象产品）：它为每种产品声明接口，在抽象产品中声明了产品所具有的业务方法。
+ ConcreteProduct（具体产品）：它定义具体工厂生产的具体产品对象，实现抽象产品接口中声明的业务方法。
+ 与工厂方法模式一样，抽象工厂模式也可为每一种产品类提供一组重载的工厂方法，以不同的方式对产品对象进行创建。

#### 抽象工厂模式与工厂方法模式最大的区别在于，工厂方法模式针对的是一个产品类，而抽象工厂模式需要面对多个产品类，一个具体工厂可以负责多个不同产品类的创建。
+ 产品类：产品类即产品的种类，如一个抽象类是电视机，其子类有海尔电视机、海信电视机、TCL电视机，则抽象电视机与具体品牌的电视机之间构成了一个产品类，抽象电视机是父类，而具体品牌的电视机是其子类。
+ 产品族：在抽象工厂模式中，产品族是指由同一个工厂生产的，属于不同产品类中的一组产品，如海尔电器工厂生产的海尔电视机、海尔电冰箱，海尔电视机属于电视类中，海尔电冰箱属于电冰箱类中，海尔电视机、海尔电冰箱构成了一个产品族。

# 所有类
1. Client
2. Factory
3. FactoryConcrete1
4. FactoryConcrete2
5. ProductA
6. ProductAConcrete1
7. ProductAConcrete2
8. ProductB
9. ProductBConcrete1
10. ProductBConcrete2
