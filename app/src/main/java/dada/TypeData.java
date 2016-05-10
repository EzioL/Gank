package dada;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ezio on 2016/5/7.
 */
public class TypeData implements Serializable{
    /**
     * error : false
     * results : [{"_id":"572a188d67765974fbfcfa04","createdAt":"2016-05-04T23:43:09.627Z","desc":"高仿下厨房App","publishedAt":"2016-05-05T12:14:21.156Z","source":"chrome","type":"App","url":"https://github.com/callmejoejoe/XCFApp","used":true,"who":"Jason"},{"_id":"572a17ed67765974f5e27e8b","createdAt":"2016-05-04T23:40:29.540Z","desc":"PLPlayerKit 是一个适用于 iOS 的音视频播放器 SDK，可高度定制化和二次开发，特色是支持 RTMP 和 HLS 直播流媒体播放。","publishedAt":"2016-05-05T12:14:21.156Z","source":"chrome","type":"iOS","url":"https://github.com/pili-engineering/PLPlayerKit","used":true,"who":"Jason"},{"_id":"5729d02267765974f5e27e89","createdAt":"2016-05-04T18:34:10.599Z","desc":"安卓启动流程概述。","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"https://yq.aliyun.com/articles/3005","used":true,"who":null},{"_id":"5729c94767765974f5e27e88","createdAt":"2016-05-04T18:04:55.85Z","desc":"如何把你的App加入白名单，列举各大厂商手机设置指南。","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"https://github.com/lorcanluo/androidwhitelist","used":true,"who":"lorcan"},{"_id":"5729bc7567765974fbfcfa00","createdAt":"2016-05-04T17:10:13.467Z","desc":"包括65536原因、multidex解决、NoClassDefFoundError、Application Not Responding、App首次启动加载方案等","publishedAt":"2016-05-06T12:04:47.203Z","source":"web","type":"Android","url":"http://yydcdut.com/2016/03/20/split-dex/","used":true,"who":"yydcdut"},{"_id":"5729a2a267765974fbfcf9fd","createdAt":"2016-05-04T15:20:02.821Z","desc":"如何优雅的设计java异常","publishedAt":"2016-05-05T12:14:21.156Z","source":"web","type":"拓展资源","url":"http://lrwinx.github.io/2016/04/28/%E5%A6%82%E4%BD%95%E4%BC%98%E9%9B%85%E7%9A%84%E8%AE%BE%E8%AE%A1java%E5%BC%82%E5%B8%B8/","used":true,"who":"瘦纸好过夏"},{"_id":"5729891c67765974fbfcf9f4","createdAt":"2016-05-04T13:31:08.145Z","desc":"stackoverflow上Java相关回答整理翻译","publishedAt":"2016-05-05T12:14:21.156Z","source":"web","type":"Android","url":"https://github.com/giantray/stackoverflow-java-top-qa","used":true,"who":"ShangjingZhu"},{"_id":"5729826c67765974fbfcf9f3","createdAt":"2016-05-04T13:02:36.87Z","desc":"微信读书 iOS 性能优化总结 ","publishedAt":"2016-05-05T12:14:21.156Z","source":"api","type":"iOS","url":"http://wereadteam.github.io/2016/05/03/WeRead-Performance/#rd","used":true,"who":"tripleCC"},{"_id":"5729794967765974fca830e7","createdAt":"2016-05-04T12:23:37.334Z","desc":"5.4","publishedAt":"2016-05-04T12:26:03.894Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bgw1f3j8jt6qn8j20vr15owvk.jpg","used":true,"who":"张涵宇"},{"_id":"5729769167765974fbfcf9f0","createdAt":"2016-05-04T12:12:01.407Z","desc":"Implementing a small DSL in Swift","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"iOS","url":"http://colindrake.me/2015/10/28/implementing-a-small-dsl-in-swift/","used":true,"who":"CallMeWhy"},{"_id":"5729768067765974fbfcf9ef","createdAt":"2016-05-04T12:11:44.524Z","desc":"弹性侧滑菜单","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"iOS","url":"https://github.com/cute/DLWBouncyView","used":true,"who":"Jason"},{"_id":"5729766767765974fca830e6","createdAt":"2016-05-04T12:11:19.309Z","desc":"A Declarative Architecture for Swift Apps\n","publishedAt":"2016-05-05T12:14:21.156Z","source":"chrome","type":"iOS","url":"https://spin.atomicobject.com/2016/04/20/declarative-swift-architecture/","used":true,"who":"CallMeWhy"},{"_id":"5729765467765974f885bffd","createdAt":"2016-05-04T12:11:00.333Z","desc":"全文搜索引擎","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"iOS","url":"https://github.com/Blue-Rocket/BRFullTextSearch","used":true,"who":"Jason"},{"_id":"5729763467765974f5e27e83","createdAt":"2016-05-04T12:10:28.855Z","desc":"光学文字识别身份证","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"iOS","url":"https://github.com/iosWellLin/OCR","used":true,"who":"Jason"},{"_id":"572958d967765974f885bffb","createdAt":"2016-05-04T10:05:13.146Z","desc":" Retrofit2 完全解析 探索与okhttp之间的关系","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"Android","url":"http://blog.csdn.net/lmj623565791/article/details/51304204","used":true,"who":"AndWang"},{"_id":"5728bb1967765974fbfcf9e7","createdAt":"2016-05-03T22:52:09.293Z","desc":"显示Github贡献、Follower、新增star数、trending等信息的轻量级应用。","publishedAt":"2016-05-04T12:26:08.372Z","source":"web","type":"Android","url":"https://github.com/Nightonke/GithubWidget","used":true,"who":"Weiping Huang"},{"_id":"5728b8f267765974fca830e2","createdAt":"2016-05-03T22:42:58.198Z","desc":"swipe的dialog","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"Android","url":"https://github.com/kakajika/SwipeAwayDialog","used":true,"who":"Jason"},{"_id":"5728856e67765974fca830e0","createdAt":"2016-05-03T19:03:10.493Z","desc":"WeRead团队博客\n","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"iOS","url":"http://wereadteam.github.io/","used":true,"who":"__weak_Point"},{"_id":"5728853467765974f885bff6","createdAt":"2016-05-03T19:02:12.855Z","desc":"Find memory leaks in your iOS app at develop time.","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"iOS","url":"https://github.com/Zepo/MLeaksFinder","used":true,"who":"__weak_Point"},{"_id":"5728701167765974fca830de","createdAt":"2016-05-03T17:32:01.708Z","desc":"Kotlin 在线编译器","publishedAt":"2016-05-04T12:26:08.372Z","source":"chrome","type":"Android","url":"http://try.kotlinlang.org/#/Examples/Hello,%20world!/Simplest%20version/Simplest%20version.kt","used":true,"who":"lxxself"}]
     */
    private boolean error;
    private ArrayList<Entity> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public ArrayList<Entity> getResults() {
        return results;
    }

    public void setResults(ArrayList<Entity> results) {
        this.results = results;
    }

    /*@Override
    public String toString() {

        return "{" +
                "error"+":" + error +
                ", results"+":[" + results.toString() +"]"+
                '}';
    }*/

    @Override
    public String toString() {
        return "TypeData{" +
                "error=" + error +
                ", results=" + results +
                '}';
    }
}
