package org.dark.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午11:38
 */
public class TeamLeader {

    public void checkCourses() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("课程数量" + courses.size());
    }
}
