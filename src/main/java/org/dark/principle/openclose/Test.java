package org.dark.principle.openclose;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午2:47
 */
public class Test {

    /**
     * 装饰者模式
     * 使用组合的方式，动态地给Java课程添加新的行为
     * 这种方式既不修改Course 接口又不修改 JavaCourse
     *
     * @param args
     */
    public static void main(String[] args) {
        // 需求: 搞活动，要给所有课程(前端，python, php)打折
        Course javaCourse = new JavaCourse(96, "Java课程", 155);
        System.out.println("打折前:");
        System.out.println(javaCourse.getPrice());
        Course course = new DiscountCourse(javaCourse, 0.8);
        System.out.println("打折后:");
        System.out.println(course.getPrice());
    }
}
