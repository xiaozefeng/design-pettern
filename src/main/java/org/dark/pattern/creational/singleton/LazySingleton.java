package org.dark.pattern.creational.singleton;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午3:42
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
