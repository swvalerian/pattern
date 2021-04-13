package main.java.com.swvalerian.basepatterns.behavioral.visitor;

public interface BookWriter {
    void create(ProjectClass projectClass);

    void create(Biblioteka biblioteka);

    void create(Test test);
}
