# 适配器模式(Adapter Pattern)

+ Class designed in this base directory is abstract illustration.
+ Class designed in sample* package is concrete illustration.

# 在对象适配器模式结构图中包含如下几个角色：
+ Target（目标抽象类）：目标抽象类定义客户所需接口，可以是一个抽象类或接口，也可以是具体类。
+ AdapterObject/AdapterClass（适配器类）：适配器可以调用另一个接口，作为一个转换器，对Adapted和Target进行适配，适配器类是适配器模式的核心，在对象适配器中，它通过继承Target并关联一个Adapted对象使二者产生联系。AdapterObject是对象适配器，通过组合对象的方式实现关联；AdapterClass是类适配器，通过继承对象的方式实现关联。
+ Adapted（适配者类）：适配者即被适配的角色，它定义了一个已经存在的接口，这个接口需要适配，适配者类一般是一个具体类，包含了客户希望使用的业务方法，在某些情况下可能没有适配者类的源代码。

# 在缺省适配器模式中，包含如下三个角色：
+ InterfaceAdapted（适配者接口）：它是一个接口，通常在该接口中声明了大量的方法。
+ DefaultAbstractAdapter（缺省适配器类）：它是缺省适配器模式的核心类，使用空方法的形式实现了在InterfaceAdapted接口中声明的方法。通常将它定义为抽象类，因为对它进行实例化没有任何意义。
+ ConcreteAdapter（具体业务类）：它是缺省适配器类的子类，在没有引入适配器之前，它需要实现适配者接口，因此需要实现在适配者接口中定义的所有方法，而对于一些无须使用的方法也不得不提供空实现。在有了缺省适配器之后，可以直接继承该适配器类，根据需要有选择性地覆盖在适配器类中定义的方法。

# 所有类
1. Client
2. AdapterObject
3. AdapterClass
4. Target
5. Adapted
6. InterfaceAdapted
7. DefaultAbstractAdapter
8. ConcreteAdapter