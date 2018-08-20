package org.dark.pattern.creational.abstractfactory;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午12:46
 */
public class GoCourseFactory implements CourseFactory{
    @Override
    public Video createVideo() {
        return new GoVideo();
    }

    @Override
    public Article createArticle() {
        return new GoArticle();
    }
}
