package org.example.chapter06.locator.generic;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private static Map<Class<?> , Object> objectMap = new HashMap<Class<?>,Object>();

    public static <T> T get(Class<T> klass) {
        return (T) objectMap.get(klass);
    }

    public static void regist(Class<?> klass , Object obj) {
        objectMap.put(klass,obj);
    }
}
