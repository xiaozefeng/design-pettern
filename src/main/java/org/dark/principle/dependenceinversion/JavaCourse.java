package org.dark.principle.dependenceinversion;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午10:19
 */
public class JavaCourse implements Course{

    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
