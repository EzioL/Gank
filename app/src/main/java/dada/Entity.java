package dada;

import java.io.Serializable;

/**
 * Created by Ezio on 2016/5/7.
 */
public class Entity implements Serializable{

    /**
     * _id : 572be7a967765974fca83109
     * createdAt : 2016-05-06T08:39:05.394Z
     * desc : Retrofit分析-经典设计模式案例
     * publishedAt : 2016-05-06T12:04:47.203Z
     * source : web
     * type : Android
     * url : http://www.jianshu.com/p/fb8d21978e38
     * used : true
     * who : Stay
     */
    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;

    public String get_id() {
        return _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public boolean isUsed() {
        return used;
    }

    public String getWho() {
        return who;
    }
}
