package org.dark.pattern.creational.simplefactory;

/**
 * @author xiaozefeng
 * @date 2018/8/19 下午7:44
 */
public class GoVideo implements Video{
    @Override
    public void produce() {
        System.out.println("录制go语言课程");
    }
}
