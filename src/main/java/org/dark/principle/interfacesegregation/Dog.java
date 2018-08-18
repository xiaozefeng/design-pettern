package org.dark.principle.interfacesegregation;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午11:27
 */
public class Dog implements EatAction, SwimAcition {


    @Override
    public void eat() {
        System.out.println("狗会吃饭");
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳");
    }
}
