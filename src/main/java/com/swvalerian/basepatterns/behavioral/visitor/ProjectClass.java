package main.java.com.swvalerian.basepatterns.behavioral.visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWriting(BookWriter bookWriter) {
        bookWriter.create(this);
    }
}
