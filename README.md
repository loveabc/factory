# factory
抽象工厂模式


抽象工厂模式，有新的需要操作的类时，只需要创建实现了Repository接口的数据库操作类，
并创建实现了RpositoryFactoryProvider的工厂生成类，使用工厂生成类生成各个数据库操作类
的工厂，并用该工程生成数据库操作类对象，使用该对象操作数据库
