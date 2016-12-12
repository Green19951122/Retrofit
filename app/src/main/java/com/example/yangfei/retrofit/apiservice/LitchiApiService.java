package com.example.yangfei.retrofit.apiservice;



import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**创建API服务接口
 * Created by yangfei on 2016/12/12.
 */

public interface LitchiApiService {
    //固定的请求路径
    @GET("GetFeeds?column=0&PageSize=10&pageIndex=1")
    Call<ResponseBody> getLitchiString();

}
