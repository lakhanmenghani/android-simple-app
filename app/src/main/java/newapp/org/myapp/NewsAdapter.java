package newapp.org.myapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import newsapp.org.myapp.objects.Article;
import newsapp.org.myapp.objects.Articles;

import com.bumptech.glide.Glide;
import java.util.List;

/**
 * Created by admin on 8/4/2016.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    List<Article> newsObjectsList;

    public NewsAdapter(List<Article> newsObjectsList) {
        this.newsObjectsList = newsObjectsList;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, final int position) {
        if(newsObjectsList==null)
            return;

        Article article = newsObjectsList.get(position);
        holder.newsTitle.setText(article.getTitle());
        holder.newsDate.setText(article.getPublishedAt());
        holder.newsDesc.setText(article.getDescription());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Clicked position " + position, Toast.LENGTH_SHORT).show();
                DetailsActivity.start(view.getContext(), position);
            }
        });
        Glide.with(holder.newsImage.getContext()).load(article.getUrlToImage()).into(holder.newsImage);
    }

    public int getItemCount()
    {
        if(newsObjectsList==null)
            return 0;

        return newsObjectsList.size();
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder {

        ImageView newsImage;
        TextView newsTitle;
        TextView newsDate;
        TextView newsDesc;
        CardView cardView;

        public NewsViewHolder(View itemView) {
            super(itemView);

            newsImage = (ImageView) itemView.findViewById(R.id.news_image);
            newsTitle = (TextView) itemView.findViewById(R.id.news_title);
            newsDate = (TextView) itemView.findViewById(R.id.news_date);
            newsDesc = (TextView) itemView.findViewById(R.id.news_stuff);
            cardView = (CardView) itemView.findViewById(R.id.news_item_card);

        }

    }
}
