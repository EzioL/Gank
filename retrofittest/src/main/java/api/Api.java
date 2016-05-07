package api;

import java.util.ArrayList;

import model.DataModel;
import model.DayModel;
import model.DayResults;
import model.Result;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by 李浩田 on 2016/5/5.
 */
public interface Api {
    /**
     * 每日数据
     * @param year 年
     * @param month 月
     * @param day 日
     * @return
     */
   /* @GET("api/day/{year}/{month}/{day}")
    Call<DayModel<DayResults>> day(
            @Path("year") int year,
            @Path("month") int month,
            @Path("day") int day
    );*/



    /**
     * 分类数据
     * @param dataType   数据类型
     * @param pageCount  请求个数
     * @param pageIndex  第几页
     * @return
     */
    @GET("api/data/{dataType}/{pageCount}/{pageIndex}")
    Call<DataModel<ArrayList<Result>>> data(
            @Path("dataType") String dataType,
            @Path("pageCount") int pageCount,
            @Path("pageIndex") int pageIndex
    );

}
