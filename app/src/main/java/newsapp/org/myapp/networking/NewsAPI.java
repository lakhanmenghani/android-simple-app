package newsapp.org.myapp.networking;


import newsapp.org.myapp.objects.Article;
import newsapp.org.myapp.objects.POJO;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by admin on 8/5/2016.
 */

public class NewsAPI {
    private static final String API_KEY = "951b9b6de2354f33a4c1e1fd080f122c ";
    private static final String BASE_URL = "https://newsapi.org/v1/";

    private static NewsInterface newsInterface;

    public static NewsInterface getNewsInterface()
    {
        if(newsInterface==null)
        {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            newsInterface = retrofit.create(NewsInterface.class);
        }
        return newsInterface;
    }

    public static interface NewsInterface {
        @GET("articles?apiKey=" + API_KEY)
        Call<POJO> getArticles(@Query("source") String source, @Query("sortBy") String sortBy );

        @GET("sources")
        Call<Article> getSources();
    }
}
