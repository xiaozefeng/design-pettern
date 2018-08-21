package org.dark.pattern.creational.singleton;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午3:44
 */
public class T implements Runnable {
    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
