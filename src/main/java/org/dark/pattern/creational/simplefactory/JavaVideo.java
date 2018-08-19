package org.dark.pattern.creational.simplefactory;

/**
 * @author xiaozefeng
 * @date 2018/8/19 下午7:43
 */
public class JavaVideo implements Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }
}
