package org.dark.pattern.creational.abstractfactory;

/**
 * @author xiaozefeng
 * @date 2018/8/20 下午12:47
 */
public class GoArticle implements Article{
    @Override
    public void produce() {
        System.out.println("编写Go语言课程手记");
    }
}
