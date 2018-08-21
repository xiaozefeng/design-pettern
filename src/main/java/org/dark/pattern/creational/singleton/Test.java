package org.dark.pattern.creational.singleton;

import java.io.*;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午3:42
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Thread t1 = new Thread(new T(), "t1");
        //Thread t2 = new Thread(new T(), "t2");
        //t1.start();
        //t2.start();
        //System.out.println("program end");
        //HungrySingleton instance = HungrySingleton.getInstance();
        //File file = new File("singleton_file");
        //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        //oos.writeObject(instance);
        //
        //ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton_file"));
        //HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        //System.out.println(instance);
        //System.out.println(newInstance);
        //System.out.println(instance == newInstance)class ;
        EnumSingleton instance = EnumSingleton.getInstance();
        System.out.println(instance);
    }
}
