package org.dark.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午4:32
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    public Object readResolve() {
        return HUNGRY_SINGLETON;
    }
}
