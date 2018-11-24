# 解释器模式(Interpreter pattern)

+ Class designed in this base directory is abstract illustration.  
+ Class designed in sample* package is concrete illustration.

# 在解释器模式结构图中包含如下几个角色：
+ Interpreter（抽象解释器）：在抽象解释器中声明了抽象的解释操作，它是所有终结符解释器和非终结符解释器的公共父类。
+ TerminalInterpreter（终结符解释器）：终结符解释器是抽象解释器的子类，它实现了与文法中的终结符相关联的解释操作，在句子中的每一个终结符都是该类的一个实例。通常在一个解释器模式中只有少数几个终结符解释器类，它们的实例可以通过非终结符解释器组成较为复杂的句子。
+ NonterminalInterpreter（非终结符解释器）：非终结符解释器也是抽象解释器的子类，它实现了文法中非终结符的解释操作，由于在非终结符解释器中可以包含终结符解释器，也可以继续包含非终结符解释器，因此其解释操作一般通过递归的方式来完成。
+ Context（环境类）：环境类又称为上下文类，它用于存储解释器之外的一些全局信息，通常它临时存储了需要解释的语句。

#### 环境类Context用于存储解释器之外的一些全局信息，它通常作为参数被传递到所有表达式的解释方法interpret()中，可以在Context对象中存储和访问表达式解释器的状态，向表达式解释器提供一些全局的、公共的数据，此外还可以在Context中增加一些所有表达式解释器都共有的功能，减轻解释器的职责。
#### 基于字符界面的格式化指令，可以根据输入的指令在字符界面中输出一些格式化内容：
1. Node：抽象节点类，抽象表达式。
2. Context：环境类，用于存储和操作需要解释的语句，在本实例中每一个需要解释的单词可以称为一个动作标记(Action Token)或命令。
3. ExpressionNode：表达式节点类，非终结符表达式。
4. CommandNode：语句命令节点类，非终结符表达式。
5. LoopCommandNode：循环命令节点类，非终结符表达式。
6. PrimitiveCommandNode：基本命令节点类，终结符表达式。

# 所有类
1. Client
2. Context
3. Interpreter
4. TerminalInterpreter
5. NonterminalInterpreter

