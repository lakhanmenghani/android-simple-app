package newapp.org.myapp;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import newsapp.org.myapp.objects.Article;
import newsapp.org.myapp.objects.Articles;
import newsapp.org.myapp.objects.NewsObject;

/**
 * Created by admin on 8/4/2016.
 */

public class DetailsActivity extends AppCompatActivity {

    public static final String KEY_POSITION = "position";
    public static final int DEFAULT_POSITIOON = -1;

    ProgressBar progressBar;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        webView = (WebView) findViewById(R.id.activity_details_webview);
        progressBar = (ProgressBar) findViewById(R.id.activity_details_progressBar);

        int position = getIntent().getIntExtra(KEY_POSITION, DEFAULT_POSITIOON);
        Article article = Articles.getArticleList().get(position);

        getSupportActionBar().setTitle(article.getTitle());

        progressBar.setVisibility(View.VISIBLE);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
            }
        });
        webView.loadUrl(article.getUrl());
    }

    public static void start(Context context, int position) {
        Intent intent = new Intent(context, DetailsActivity.class);
        intent.putExtra(KEY_POSITION, position);

        context.startActivity(intent);
    }

}
