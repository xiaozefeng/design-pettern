package org.dark.pattern.creational.factorymethod;

/**
 * @author xiaozefeng
 * @date 2018/8/20 上午12:38
 */
public class GoVideoFactory implements VideoFactory{
    @Override
    public Video productVideo() {
        return new GoVideo();
    }
}
