package ablack13.npsdk;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ablack13.npsdk.Api;
import ablack13.npsdk.common.ApiConst;

/**
 * Created by scijoker on 15.10.16.
 */

public class NovaPoshtaSDK {
    private static Api api;
    private static Retrofit retrofit;
    private static OkHttpClient okHttpClient;

    public static void setup(String apiKey, boolean needLogging) {
        ApiConst.API_KEY = apiKey;
        retrofit = new Retrofit.Builder()
                .baseUrl(ApiConst.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(provideHttpClient(needLogging))
                .build();
        api = retrofit.create(Api.class);
    }

    public static Api getApi() {
        return api;
    }

    private static OkHttpClient provideHttpClient(boolean needLogging) {
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .readTimeout(5, TimeUnit.SECONDS)
                    .writeTimeout(5, TimeUnit.SECONDS)
                    .addInterceptor(provideInterceptor(needLogging))
                    .build();
        }
        return okHttpClient;
    }

    private static Interceptor provideInterceptor(boolean needLogging) {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(needLogging ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE);
        return logging;
    }
}
