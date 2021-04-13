package main.java.com.swvalerian.basepatterns.behavioral.template;

public class WebRunner {
    public static void main(String[] args) {
        WebSiteTemplate news = new NewsPage();
        WebSiteTemplate welcome = new WelcomePage();

        news.showPage();
        welcome.showPage();
    }
}
