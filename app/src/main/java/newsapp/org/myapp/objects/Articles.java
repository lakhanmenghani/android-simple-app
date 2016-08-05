package newsapp.org.myapp.objects;

import java.util.List;

/**
 * Created by admin on 8/5/2016.
 */

public class Articles {

    public static List<Article> articleList;

    public static List<Article> getArticleList() {
        return articleList;
    }

    public static void setArticleList(List<Article> articleList) {
        Articles.articleList = articleList;
    }

}
