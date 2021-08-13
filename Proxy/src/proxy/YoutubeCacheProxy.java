package proxy;

import media.ThirdPartyYoutubeImpl;
import media.ThirdPartyYoutubeLib;
import media.Video;

import java.util.HashMap;

/**
 * @author zhanggeng
 * @date 2021/8/10 14:41
 */
public class YoutubeCacheProxy implements ThirdPartyYoutubeLib{
    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeImpl();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
