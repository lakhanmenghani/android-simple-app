package newapp.org.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import newsapp.org.myapp.objects.Article;
import newsapp.org.myapp.objects.Articles;
import newsapp.org.myapp.objects.NewsObject;
import newsapp.org.myapp.objects.POJO;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import newsapp.org.myapp.networking.NewsAPI;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    RecyclerView recyclerView;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.news_item);
        progressBar = (ProgressBar) findViewById(R.id.news_progress);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        progressBar.setVisibility(View.VISIBLE);

        Call<POJO> responseCall = NewsAPI.getNewsInterface().getArticles("bbcnews", "top");
        responseCall.enqueue(new Callback<POJO>() {
            @Override
            public void onResponse(Call<POJO> call, Response<POJO> response) {

                POJO pojo = response.body();
                Articles.setArticleList(pojo.getArticles());

                progressBar.setVisibility(View.GONE);

                NewsAdapter newsAdapter = new NewsAdapter(pojo.getArticles());
                recyclerView.setAdapter(newsAdapter);
                Toast.makeText(MainActivity.this, "response received", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<POJO> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error received", Toast.LENGTH_SHORT).show();
            }
        });






    }


}
