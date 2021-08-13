package media;

import java.util.HashMap;

/**
 * @author zhanggeng
 * @date 2021/8/10 14:35
 */
public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
