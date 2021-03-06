package newsapp.org.myapp.objects;

/**
 * Created by admin on 8/4/2016.
 */

import java.util.ArrayList;

public class NewsObject {

    private String imageUrl;
    private String title;
    private String date;
    private String desc;
    private String detailUrl;
    private static ArrayList<NewsObject> newsList;

    public NewsObject(String imageUrl, String title, String date, String desc, String detailUrl) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.date = date;
        this.desc = desc;
        this.detailUrl = detailUrl;

    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    @Override
    public String toString() {
        return "NewsObject{" +
                "imageUrl='" + imageUrl + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", desc='" + desc + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                '}';
    }

    public static ArrayList<NewsObject> getNewsObjects()
    {
        newsList= new ArrayList<NewsObject>();
        newsList.add(new NewsObject("https://tctechcrunch2011.files.wordpress.com/2016/08/gettyimages-584268466.jpg?w=764&amp;h=400&amp;crop=1",
                "New York Governor signs daily fantasy sports bill, DraftKings and FanDuel can operate again",
                "2016-08-04T04:20:46Z",
                "Back in June on the last day of the New York Assembly's legislative session, the state passed a bill legalizing daily fantasy sports, paving the road for the..",
                "http://social.techcrunch.com/2016/08/03/new-york-governor-signs-daily-fantasy-sports-bill-draftkings-and-fanduel-can-operate-again/"));

        newsList.add(new NewsObject("https://tctechcrunch2011.files.wordpress.com/2016/08/gettyimages-584268466.jpg?w=764&amp;h=400&amp;crop=1",
                "New York Governor signs daily fantasy sports bill, DraftKings and FanDuel can operate again",
                "2016-08-04T04:20:46Z",
                "Back in June on the last day of the New York Assembly's legislative session, the state passed a bill legalizing daily fantasy sports, paving the road for the..",
                "http://social.techcrunch.com/2016/08/03/new-york-governor-signs-daily-fantasy-sports-bill-draftkings-and-fanduel-can-operate-again/"));

        newsList.add(new NewsObject("https://tctechcrunch2011.files.wordpress.com/2016/08/gettyimages-584268466.jpg?w=764&amp;h=400&amp;crop=1",
                "New York Governor signs daily fantasy sports bill, DraftKings and FanDuel can operate again",
                "2016-08-04T04:20:46Z",
                "Back in June on the last day of the New York Assembly's legislative session, the state passed a bill legalizing daily fantasy sports, paving the road for the..",
                "http://social.techcrunch.com/2016/08/03/new-york-governor-signs-daily-fantasy-sports-bill-draftkings-and-fanduel-can-operate-again/"));

        newsList.add(new NewsObject("https://tctechcrunch2011.files.wordpress.com/2016/08/gettyimages-584268466.jpg?w=764&amp;h=400&amp;crop=1",
                "New York Governor signs daily fantasy sports bill, DraftKings and FanDuel can operate again",
                "2016-08-04T04:20:46Z",
                "Back in June on the last day of the New York Assembly's legislative session, the state passed a bill legalizing daily fantasy sports, paving the road for the..",
                "http://social.techcrunch.com/2016/08/03/new-york-governor-signs-daily-fantasy-sports-bill-draftkings-and-fanduel-can-operate-again/"));

        newsList.add(new NewsObject("https://tctechcrunch2011.files.wordpress.com/2016/08/gettyimages-584268466.jpg?w=764&amp;h=400&amp;crop=1",
                "New York Governor signs daily fantasy sports bill, DraftKings and FanDuel can operate again",
                "2016-08-04T04:20:46Z",
                "Back in June on the last day of the New York Assembly's legislative session, the state passed a bill legalizing daily fantasy sports, paving the road for the..",
                "http://social.techcrunch.com/2016/08/03/new-york-governor-signs-daily-fantasy-sports-bill-draftkings-and-fanduel-can-operate-again/"));
        return newsList;
    }
}
