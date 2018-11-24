# 策略模式(Strategy pattern)

+ Class designed in this base directory is abstract illustration.  
+ Class designed in sample* package is concrete illustration.

# 在策略模式结构图中包含如下几个角色：
+ Context（环境类）：环境类是使用算法的角色，它在解决某个问题（即实现某个方法）时可以采用多种策略。在环境类中维持一个对抽象策略类的引用实例，用于定义所采用的策略。
+ Strategy（抽象策略类）：它为所支持的算法声明了抽象方法，是所有策略类的父类，它可以是抽象类或具体类，也可以是接口。环境类通过抽象策略类中声明的方法在运行时调用具体策略类中实现的算法。
+ StrategyConcrete*（具体策略类）：它实现了在抽象策略类中声明的算法，在运行时，具体策略类将覆盖在环境类中定义的抽象策略类对象，使用一种具体的算法实现某个业务处理。
        
# 所有类
1. Client
2. Context
3. Strategy
4. StrategyConcreteA
5. StrategyConcreteB
6. StrategyConcreteC



