package com.ezio.recyclerview;



import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Stay on 13/4/16.
 * Powered by www.stay4it.com
 */
public interface Api {
    @GET("api/day/{year}/{month}/{day}")
    Call<DayData> day(
                    @Path("year") int year,
                    @Path("month") int month,
                    @Path("day") int day
            );


    @GET("api/data/福利/{pageCount}/{pageIndex}")
    Call<BaseModel<ArrayList<BaseData>>> defaultBenefits(
            @Path("pageCount") int pageCount,
            @Path("pageIndex") int pageIndex
    );
    @GET("api/data/all/{pageCount}/{pageIndex}")
    Call<data> defaultAll(
            @Path("pageCount") int pageCount,
            @Path("pageIndex") int pageIndex
    );
}
