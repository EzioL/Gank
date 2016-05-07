package api;

import dada.DailyData;
import dada.TypeData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Ezio on 2016/5/7.
 */
public interface Api {

    /**
     *
     * @param year 年
     * @param month 月
     * @param day 日
     * @return 每日数据
     */
    @GET("api/day/{year}/{month}/{day}")
    Call<DailyData> daily(
            @Path("year") int year,
            @Path("month") int month,
            @Path("day") int day
    );

    /**
     *
     * @param dataType 数据类型
     * @param pageCount 请求个数
     * @param pageIndex 第几页
     * @return 分类数据
     */
    @GET("api/data/{dataType}/{pageCount}/{pageIndex}")
    Call<TypeData> data(
            @Path("dataType") String dataType,
            @Path("pageCount") int pageCount,
            @Path("pageIndex") int pageIndex
    );

    public static final String Welfare = "福利";
    public static final String Android = "Android";
    public static final String IOS = "iOS";
    public static final String VideoRest = "休息视频";
    public static final String Expandresources = "拓展资源";
    public static final String Web = "前端";
    public static final String All = "all";

}
