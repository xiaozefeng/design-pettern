package org.dark.pattern.creational.simplefactory;

/**
 * @author xiaozefeng
 * @date 2018/8/19 下午9:39
 */
public class VideoFactory {

    public static Video getVideo(String video) {
        if (video.equals("java")) {
            return new JavaVideo();
        } else if (video.equals("go")) {
            return new GoVideo();
        }
        throw new UnsupportedOperationException("不支持的video类型");
    }
}
