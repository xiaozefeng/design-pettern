package org.dark.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午11:38
 */
public class Boss {

    private TeamLeader teamLeader;

    public Boss(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }

    public void checkCourseNumber() {
        teamLeader.checkCourses();
    }
}
