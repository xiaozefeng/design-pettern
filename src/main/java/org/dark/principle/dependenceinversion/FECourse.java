package org.dark.principle.dependenceinversion;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午10:21
 */
public class FECourse implements Course {
    @Override
    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}
