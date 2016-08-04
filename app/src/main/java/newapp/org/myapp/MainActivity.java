package newapp.org.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ImageView;
import android.widget.ProgressBar;

import newsapp.org.myapp.objects.NewsObject;

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
        NewsAdapter newsAdapter = new NewsAdapter(NewsObject.getNewsObjects());
        recyclerView.setAdapter(newsAdapter);


    }


}
