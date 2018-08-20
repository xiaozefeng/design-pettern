package org.dark.pattern.creational.abstractfactory;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午12:47
 */
public class GoVideo implements Video{
    @Override
    public void produce() {
        System.out.println("录制Go语言课程");
    }
}
