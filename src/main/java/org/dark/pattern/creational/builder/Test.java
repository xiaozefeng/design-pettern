package org.dark.pattern.creational.builder;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午3:00
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .buildCpu("酷睿I7")
                .buildMainBoard("华硕主板")
                .build();
        System.out.println(computer);
    }

}
