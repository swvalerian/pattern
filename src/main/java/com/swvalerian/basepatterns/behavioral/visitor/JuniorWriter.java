package main.java.com.swvalerian.basepatterns.behavioral.visitor;

import java.util.jar.JarOutputStream;

public class JuniorWriter implements BookWriter {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing poor book");
    }

    @Override
    public void create(Biblioteka biblioteka) {
        System.out.println("Drop biblioteka");
    }

    @Override
    public void create(Test test) {
        System.out.println("not realable tests");
    }
}
