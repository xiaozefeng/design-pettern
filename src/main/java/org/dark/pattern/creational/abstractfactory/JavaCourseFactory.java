package org.dark.pattern.creational.abstractfactory;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午12:44
 */
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    @Override
    public Article createArticle() {
        return new JavaArticle();
    }
}
