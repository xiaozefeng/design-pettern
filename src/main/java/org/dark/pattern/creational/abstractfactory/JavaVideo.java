package org.dark.pattern.creational.abstractfactory;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午12:43
 */
public class JavaVideo implements Video{
    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }
}
