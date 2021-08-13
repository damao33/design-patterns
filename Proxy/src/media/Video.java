package media;

/**
 * @author zhanggeng
 * @date 2021/8/10 14:37
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}