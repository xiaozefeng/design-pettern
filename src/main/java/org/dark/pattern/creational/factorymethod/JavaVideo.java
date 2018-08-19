package org.dark.pattern.creational.factorymethod;

/**
 * @author xiaozefeng
 * @date 2018/8/20 上午12:35
 */
public class JavaVideo implements Video{
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
