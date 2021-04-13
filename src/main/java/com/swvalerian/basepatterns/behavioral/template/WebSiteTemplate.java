package main.java.com.swvalerian.basepatterns.behavioral.template;

public abstract class WebSiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    abstract public void showPageContent();
}
