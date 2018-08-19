package org.dark.pattern.creational.factorymethod;

/**
 * @author xiaozefeng
 * @date 2018/8/20 上午12:36
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.productVideo();
        video.produce();

        factory = new GoVideoFactory();
        factory.productVideo().produce();


    }
}
