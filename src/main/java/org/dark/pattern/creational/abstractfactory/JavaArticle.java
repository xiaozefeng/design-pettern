package org.dark.pattern.creational.abstractfactory;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午12:43
 */
public class JavaArticle implements Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
