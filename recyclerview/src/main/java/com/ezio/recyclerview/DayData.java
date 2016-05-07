package com.ezio.recyclerview;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ezio on 2016/5/7.
 */
public class DayData implements Serializable {

    /**
     * category : ["休息视频","拓展资源","Android","iOS","瞎推荐","福利"]
     * error : false
     * results : {"Android":[{"_id":"5729bc7567765974fbfcfa00","createdAt":"2016-05-04T17:10:13.467Z","desc":"包括65536原因、multidex解决、NoClassDefFoundError、Application Not Responding、App首次启动加载方案等","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"http://yydcdut.com/2016/03/20/split-dex/","used":true,"who":"yydcdut"},{"_id":"5729c94767765974f5e27e88","createdAt":"2016-05-04T18:04:55.85Z","desc":"如何把你的App加入白名单，列举各大厂商手机设置指南。","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"https://github.com/lorcanluo/androidwhitelist","used":true,"who":"lorcan"},{"_id":"5729d02267765974f5e27e89","createdAt":"2016-05-04T18:34:10.599Z","desc":"安卓启动流程概述。","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"https://yq.aliyun.com/articles/3005","used":true,"who":null},{"_id":"572ae41067765974fca830fc","createdAt":"2016-05-05T14:11:28.872Z","desc":"Android 插件化的过去-现在-未来","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"http://kymjs.com/code/2016/05/04/01","used":true,"who":"张涛"},{"_id":"572be7a967765974fca83109","createdAt":"2016-05-06T08:39:05.394Z","desc":"Retrofit分析-经典设计模式案例","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"http://www.jianshu.com/p/fb8d21978e38","used":true,"who":"Stay"},{"_id":"572c0df967765974f885c01c","createdAt":"2016-05-06T11:22:33.827Z","desc":"https://github.com/marcuswestin/WebViewJavascriptBridge Objective-C与JavaScript交互在Android端的扩展","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"https://github.com/gzsll/WebViewJavascriptBridge","used":true,"who":"gzsll"},{"_id":"572c10ac67765974fbfcfa19","createdAt":"2016-05-06T11:34:04.190Z","desc":"一个学习 Android 开发相关技术的项目","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"Android","url":"http://www.jianshu.com/p/faf1ce1e232b","used":true,"who":"AndWang"}],"iOS":[{"_id":"572adc9f67765974f5e27e95","createdAt":"2016-05-05T13:39:43.269Z","desc":"微信读书 iOS 性能优化总结","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"iOS","url":"http://wereadteam.github.io/2016/05/03/WeRead-Performance/","used":true,"who":"鲍永章"},{"_id":"572ae1b767765974fca830fb","createdAt":"2016-05-05T14:01:27.129Z","desc":"iOS移动端架构的那些事","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"iOS","url":"http://www.jianshu.com/p/15e5b83ab70e?utm_campaign=hugo&utm_medium=reader_share&utm_content=note&utm_source=qq","used":true,"who":"tripleCC"},{"_id":"572bf3b267765974fbfcfa13","createdAt":"2016-05-06T09:30:26.969Z","desc":"漂亮的 material design 风格页面滑块","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"iOS","url":"https://github.com/Ramotion/paper-onboarding","used":true,"who":"Dear宅学长"},{"_id":"572bf43867765974fbfcfa14","createdAt":"2016-05-06T09:32:40.577Z","desc":"高可定制化，既支持横向，也支持纵向布局的图文 Segment Control 组件","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"iOS","url":"https://github.com/sima-11/SMSegmentView","used":true,"who":"Dear宅学长"},{"_id":"572bfd1567765974fbfcfa15","createdAt":"2016-05-06T10:10:29.507Z","desc":"iOS 上成熟的夜间模式解决方案","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"iOS","url":"http://draveness.me/night","used":true,"who":"Draveness"}],"休息视频":[{"_id":"5720c8a767765974f885bfb6","createdAt":"2016-04-27T22:11:51.285Z","desc":"狼性团队.....","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"休息视频","url":"http://www.miaopai.com/show/chj~~VGPqbVvDGQi2kvTuQ__.htm","used":true,"who":"LHF"}],"拓展资源":[{"_id":"572170b367765974fca830a6","createdAt":"2016-04-28T10:08:51.288Z","desc":"可以免费使用的 emoji art，Dropbox Paper 在用，可以免费用在商业项目上。","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"拓展资源","url":"http://emojione.com/","used":true,"who":"Chunlea"}],"瞎推荐":[{"_id":"572bf25267765974f885c01b","createdAt":"2016-05-06T09:24:34.915Z","desc":"可以任性搜索音乐的 chrome 插件","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"瞎推荐","url":"https://github.com/listen1/listen1_chrome_extension","used":true,"who":"蒋朋"}],"福利":[{"_id":"572c146a67765974f885c01e","createdAt":"2016-05-06T11:50:02.319Z","desc":"无版权","publishedAt":"2016-05-06T12:04:47.203Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f3litmfts1j20qo0hsac7.jpg","used":true,"who":"代码家"}]}
     */

    private boolean error;
    private ResultsEntity results;
    private List<String> category;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ResultsEntity getResults() {
        return results;
    }

    public void setResults(ResultsEntity results) {
        this.results = results;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public static class ResultsEntity {
        /**
         * _id : 5729bc7567765974fbfcfa00
         * createdAt : 2016-05-04T17:10:13.467Z
         * desc : 包括65536原因、multidex解决、NoClassDefFoundError、Application Not Responding、App首次启动加载方案等
         * publishedAt : 2016-05-06T12:04:47.203Z
         * source : web
         * type : Android
         * url : http://yydcdut.com/2016/03/20/split-dex/
         * used : true
         * who : yydcdut
         */

        private List<AndroidEntity> Android;
        /**
         * _id : 572adc9f67765974f5e27e95
         * createdAt : 2016-05-05T13:39:43.269Z
         * desc : 微信读书 iOS 性能优化总结
         * publishedAt : 2016-05-06T12:04:47.203Z
         * source : chrome
         * type : iOS
         * url : http://wereadteam.github.io/2016/05/03/WeRead-Performance/
         * used : true
         * who : 鲍永章
         */

        private List<IOSEntity> iOS;
        /**
         * _id : 5720c8a767765974f885bfb6
         * createdAt : 2016-04-27T22:11:51.285Z
         * desc : 狼性团队.....
         * publishedAt : 2016-05-06T12:04:47.203Z
         * source : chrome
         * type : 休息视频
         * url : http://www.miaopai.com/show/chj~~VGPqbVvDGQi2kvTuQ__.htm
         * used : true
         * who : LHF
         */

        private List<休息视频Entity> 休息视频;
        /**
         * _id : 572170b367765974fca830a6
         * createdAt : 2016-04-28T10:08:51.288Z
         * desc : 可以免费使用的 emoji art，Dropbox Paper 在用，可以免费用在商业项目上。
         * publishedAt : 2016-05-06T12:04:47.203Z
         * source : web
         * type : 拓展资源
         * url : http://emojione.com/
         * used : true
         * who : Chunlea
         */

        private List<拓展资源Entity> 拓展资源;
        /**
         * _id : 572bf25267765974f885c01b
         * createdAt : 2016-05-06T09:24:34.915Z
         * desc : 可以任性搜索音乐的 chrome 插件
         * publishedAt : 2016-05-06T12:04:47.203Z
         * source : chrome
         * type : 瞎推荐
         * url : https://github.com/listen1/listen1_chrome_extension
         * used : true
         * who : 蒋朋
         */

        private List<瞎推荐Entity> 瞎推荐;
        /**
         * _id : 572c146a67765974f885c01e
         * createdAt : 2016-05-06T11:50:02.319Z
         * desc : 无版权
         * publishedAt : 2016-05-06T12:04:47.203Z
         * source : chrome
         * type : 福利
         * url : http://ww4.sinaimg.cn/large/610dc034jw1f3litmfts1j20qo0hsac7.jpg
         * used : true
         * who : 代码家
         */

        private List<福利Entity> 福利;

        public List<AndroidEntity> getAndroid() {
            return Android;
        }

        public void setAndroid(List<AndroidEntity> Android) {
            this.Android = Android;
        }

        public List<IOSEntity> getIOS() {
            return iOS;
        }

        public void setIOS(List<IOSEntity> iOS) {
            this.iOS = iOS;
        }

        public List<休息视频Entity> get休息视频() {
            return 休息视频;
        }

        public void set休息视频(List<休息视频Entity> 休息视频) {
            this.休息视频 = 休息视频;
        }

        public List<拓展资源Entity> get拓展资源() {
            return 拓展资源;
        }

        public void set拓展资源(List<拓展资源Entity> 拓展资源) {
            this.拓展资源 = 拓展资源;
        }

        public List<瞎推荐Entity> get瞎推荐() {
            return 瞎推荐;
        }

        public void set瞎推荐(List<瞎推荐Entity> 瞎推荐) {
            this.瞎推荐 = 瞎推荐;
        }

        public List<福利Entity> get福利() {
            return 福利;
        }

        public void set福利(List<福利Entity> 福利) {
            this.福利 = 福利;
        }

        public static class AndroidEntity {
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

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class IOSEntity {
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

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 休息视频Entity {
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

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 拓展资源Entity {
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

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 瞎推荐Entity {
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

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 福利Entity {
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

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }
    }
}
