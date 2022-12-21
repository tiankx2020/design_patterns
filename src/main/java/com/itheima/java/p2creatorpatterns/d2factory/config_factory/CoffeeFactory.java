package com.itheima.java.p2creatorpatterns.d2factory.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Description: 工厂类
 * @author: scott
 * @date: 2022年04月04日 16:43
 */
public class CoffeeFactory {

    //加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    //1.首先通过properties获取到properties中的具体产品的全限定名
    //2. 通过反射技术创建出对象
    //3.将对象存储在容器Map集合中
    //4. 提供一个对望访问方法，参数为具体产品的名称，返回这个值得对象
    private static Map<String, Coffee> map = new HashMap<>();

    static {
        Properties properties = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String val = properties.getProperty((String) key);
                //通过反射获取对象
                Class clazz = Class.forName(val);
                Coffee coffee = (Coffee) clazz.newInstance();
                //将名称和对象存储在容器中
                map.put((String) key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name) {
        //2. 加载配置文件
        return map.get(name);
    }
}
