package org.dark.principle.dependenceinversion;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午4:34
 */
public class Peter {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public void studyCourse() {
        course.studyCourse();
    }
}
