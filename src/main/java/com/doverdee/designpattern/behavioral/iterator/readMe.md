# 迭代器模式(Iterator pattern)

+ Class designed in this base directory is abstract illustration.  
+ Class designed in sample* package is concrete illustration.

# 在迭代器模式结构图中包含如下几个角色：
+ Iterator（抽象迭代器）：它定义了访问和遍历元素的接口，声明了用于遍历数据元素的方法，在具体迭代器中将实现这些方法。
+ IteratorConcrete（具体迭代器）：它实现了抽象迭代器接口，完成对聚合对象的遍历，同时在具体迭代器中通过游标来记录在聚合对象中所处的当前位置，在具体实现时，游标通常是一个表示位置的非负整数。
+ Aggregate（抽象聚合类）：它用于存储和管理元素对象，声明一个createIterator()方法用于创建一个迭代器对象，充当抽象迭代器工厂角色。
+ AggregateConcrete（具体聚合类）：它实现了在抽象聚合类中声明的createIterator()方法，该方法返回一个与该具体聚合类对应的具体迭代器ConcreteIterator实例。

# 所有类
1. Client
2. Iterator
3. IteratorConcrete
4. Aggregate
5. AggregateConcrete

