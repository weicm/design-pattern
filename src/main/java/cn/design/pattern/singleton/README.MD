# 说明
- 这里所有单例模式只考虑线程安全的情况

# 推荐使用排序
1. EnumLazySingleton
2. StaticInnerClassLazySingleton
3. DoubleCheckLazySingleton
4. SynchronizedLazySingleton
5. StaticFieldHungrySingleton

# 使用场景
- 对象初始化耗时过多, 但又经常使用的对象
- 需要频繁实例化并销毁的对象

# 优点
- 控制对象初始化, 保证内存只有一个对象, 降低内存消耗
- 如果类初始化耗时, 则共享唯一实例, 避免重复创建, 可提高程序性能

# 缺点
- 单例类职责过重, 在一定程度上违背了"单一职责"原则
- 由与单例类没有抽象层, 因此扩展性差