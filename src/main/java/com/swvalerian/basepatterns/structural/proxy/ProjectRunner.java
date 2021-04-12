package main.java.com.swvalerian.basepatterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project realProject = new ProxyProject("https://www.github.com//swvalerian/crud");
        realProject.run();
    }
}
