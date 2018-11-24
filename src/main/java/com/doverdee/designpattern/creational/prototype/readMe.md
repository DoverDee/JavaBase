# 原型模式(Prototype  Pattern)

+ Class designed in this base directory is abstract illustration.
+ Class designed in sample* package is concrete illustration.

# 在原型模式结构图中包含如下几个角色：
+ PrototypeManager（原型管理类）：原型管理器是将多个原型对象存储在一个集合中供客户端使用，它是一个专门负责克隆对象的工厂，其中定义了一个集合用于存储原型对象，如果需要某个原型对象的一个克隆，可以通过复制集合中对应的原型对象来获得。在原型管理器中针对抽象原型类进行编程，以便扩展。
+ Prototype（抽象原型类）：它是声明克隆方法的接口，是所有具体原型类的公共父类，可以是抽象类也可以是接口，甚至还可以是具体实现类。
+ PrototypeConcrete（具体原型类）：它实现在抽象原型类中声明的克隆方法，在克隆方法中返回自己的一个克隆对象。

# 浅克隆
+ 在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；如果原型对象的成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，也就是说原型对象和克隆对象的成员变量指向相同的内存地址。简单来说，在浅克隆中，当对象被复制时只复制它本身和其中包含的值类型的成员变量，而引用类型的成员对象并没有复制。
+ 在Java语言中，通过覆盖Object类的clone()方法可以实现浅克隆。需要注意的是能够覆盖实现克隆的对象其类必须实现Cloneable接口，否则无法覆盖实现克隆操作。
# 深克隆
+ 在深克隆中，无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，深克隆将原型对象的所有引用对象也复制一份给克隆对象。简单来说，在深克隆中，除了对象本身被复制外，对象所包含的所有成员变量也将复制。
+ 在Java语言中，如果需要实现深克隆，可以通过序列化(Serialization)等方式来实现。序列化就是将对象写到流的过程，写到流中的对象是原有对象的一个拷贝，而原对象仍然存在于内存中。通过序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象，因此通过序列化将对象写到一个流中，再从流里将其读出来，可以实现深克隆。需要注意的是能够实现序列化的对象其类必须实现Serializable接口，否则无法实现序列化操作。

# 所有类
1. Client
2. PrototypeManager
3. Prototype
4. PrototypeConcreteWithDeepCopy
5. ObjectFieldSerializable
6. PrototypeConcreteWithShallowCopy
7. ObjectField
8. CopyDeep
9. CopyShallow

