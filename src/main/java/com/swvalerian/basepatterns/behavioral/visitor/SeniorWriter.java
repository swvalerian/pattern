package main.java.com.swvalerian.basepatterns.behavioral.visitor;

public class SeniorWriter implements BookWriter {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("reWrite book after junior writer");
    }

    @Override
    public void create(Biblioteka biblioteka) {
        System.out.println("create biblio");
    }

    @Override
    public void create(Test test) {
        System.out.println("creating reliable test");
    }
}
