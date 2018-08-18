package org.dark.principle.demeter;

/**
 * @author xiaozefeng
 * @date 2018/8/18 下午11:42
 */
public class Test {

    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Boss boss = new Boss(teamLeader);
        boss.checkCourseNumber();
    }
}
