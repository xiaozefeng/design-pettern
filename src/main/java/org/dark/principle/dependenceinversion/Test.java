package org.dark.principle.dependenceinversion;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午10:19
 */
public class Test {
    //public static void main(String[] args) {
    //    Peter peter = new Peter();
    //    peter.studyCourse(new JavaCourse());
    //    peter.studyCourse(new FECourse());
    //    peter.studyCourse(new GoCourse());
    //}

    public static void main(String[] args) {
        Peter peter = new Peter();

        peter.setCourse(new JavaCourse());
        peter.studyCourse();

        peter.setCourse(new GoCourse());
        peter.studyCourse();
    }
}
