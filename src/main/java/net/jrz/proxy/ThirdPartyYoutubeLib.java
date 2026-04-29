package net.jrz.proxy;

import java.util.Map;

// 第三方YouTube接口
public interface ThirdPartyYoutubeLib {
    Map<String, Video> popularVideos();
    Video getVideo(String videoId);
}
