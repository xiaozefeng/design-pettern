package org.dark.pattern.creational.simplefactory;

/**
 * @author xiaozefeng
 * @date 2018/8/19 下午5:53
 */
public class Test {
    public static void main(String[] args) {
        Video java = VideoFactory.getVideo("java");
        java.produce();

        Video go = VideoFactory.getVideo("go");
        go.produce();
    }
}
