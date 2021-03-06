# 最少知识原则(Least Knowledge Principle, LKP)

## 定义
一个软件实体应当尽可能少地与其他实体发生相互作用。最少知识原则又称为迪米特法则(Law of Demeter, LoD)。

## 阐释
1. 迪米特法则要求限制软件实体之间通信的宽度和深度。迪米特法则可降低系统的耦合度，使类与类之间保持松散的耦合关系。
2. 如果一个对象需要调用另一个对象的某一个方法的话，可以通过引入一个合理的第三者来降低现有对象之间的耦合度。
3. 在类的划分上，应当尽量创建松耦合的类，类之间的耦合度越低，就越有利于复用，一个处在松耦合中的类一旦被修改，不会对关联的类造成太大波及。
4. 在类的结构设计上，每一个类都应当尽量降低其成员变量和成员函数的访问权限。
5. 在类的设计上，只要有可能，一个类型应当设计成不变类。
6. 在对其他类的引用上，一个对象对其他对象的引用应当降到最低。
7. 迪米特法则具体形式包括不要和“陌生人”说话、只与你的直接“朋友”通信等。

>#### 对于一个对象，其朋友包括以下几类：
>1. 当前对象本身(this)；
>2. 当前对象的成员对象，如果当前对象的成员对象是一个集合，那么集合中的元素也都是朋友；
>3. 以参数形式传入到当前对象方法中的对象；
>4. 当前对象所创建的对象。
