# 桥接模式(Bridge Pattern)

+ Class designed in this base directory is abstract illustration.
+ Class designed in sample* package is concrete illustration.

# 在桥接模式结构图中包含如下几个角色：
+ AbstractBridge（抽象类）：用于定义抽象类的接口，它一般是抽象类而不是接口，其中定义了一个InterfaceBridge（接口类）类型的对象并可以维护该对象，它与InterfaceBridge之间具有关联关系，它既可以包含抽象业务方法，也可以包含具体业务方法。
+ AbstractBridgeExtA、AbstractBridgeExtB（扩充抽象类）：扩充由AbstractBridge定义的接口，通常情况下它不再是抽象类而是具体类，它实现了在AbstractBridge中声明的抽象业务方法，在AbstractBridge中可以调用在InterfaceBridge中定义的业务方法。
+ InterfaceBridge（接口类）：定义实现类的接口，这个接口不一定要与AbstractBridge的接口完全一致，事实上这两个接口可以完全不同，一般而言，InterfaceBridge接口仅提供基本操作，而AbstractBridge定义的接口可能会做更多更复杂的操作。InterfaceBridge接口对这些基本操作进行了声明，而具体实现交给其子类。通过关联关系，在AbstractBridge中不仅拥有自己的方法，还可以调用到InterfaceBridge中定义的方法，使用关联关系来替代继承关系。
+ InterfaceBridgeImpA、InterfaceBridgeImpB（具体实现类）：具体实现InterfaceBridge接口，在不同的实现子类中提供基本操作的不同实现，在程序运行时，实现类对象将替换其父类对象，提供给抽象类具体的业务操作方法。
+ Bridge（辅助类）：用于两个维度之间的通信，通常为数据包装类。

#### 桥接模式是一个非常有用的模式，在桥接模式中体现了很多面向对象设计原则的思想，包括“单一职责原则”、“开闭原则”、“合成复用原则”、“里氏代换原则”、“依赖倒转原则”等。熟悉桥接模式有助于我们深入理解这些设计原则，也有助于我们形成正确的设计思想和培养良好的设计风格。
#### 在使用桥接模式时，我们首先应该识别出一个类所具有的两个独立变化的维度，将它们设计为两个独立的继承等级结构，为两个维度都提供抽象层，并建立抽象耦合。通常情况下，我们将具有两个独立变化维度的类的一些普通业务方法和与之关系最密切的维度设计为“抽象类”层次结构（扩充抽象类），而将另一个维度设计为“接口类”层次结构（具体实现类）。

# 所有类
1. Client
2. AbstractBridge
3. AbstractBridgeExtA
4. AbstractBridgeExtB
5. Bridge
6. InterfaceBridge
7. InterfaceBridgeImpA
8. InterfaceBridgeImpB