package org.dark.principle.dependenceinversion;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午10:23
 */
public class GoCourse implements Course {
    @Override
    public void studyCourse() {
        System.out.println("学习GO语言");
    }
}
