package Api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apifactory {
    private static Apifactory apifactory;
    private static Retrofit retrofit;
    private static final String BASE_URK="http://gitlab.65apps.com/65gb/static/raw/master/";

    private Apifactory() {
        retrofit=new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).baseUrl(BASE_URK).build();
    }

    private static Apifactory getInstance(){
        if(apifactory==null){
            apifactory=new Apifactory();
        }
        return apifactory;
    }
    public Apiservice getApiservice(){
        return retrofit.create(Apiservice.class);
    }
}
