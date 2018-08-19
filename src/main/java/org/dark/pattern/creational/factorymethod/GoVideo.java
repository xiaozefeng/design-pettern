package org.dark.pattern.creational.factorymethod;

/**
 * @author xiaozefeng
 * @date 2018/8/20 上午12:36
 */
public class GoVideo implements Video{

    @Override
    public void produce() {
        System.out.println("录制Go语言视频");
    }
}
