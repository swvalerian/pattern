package main.java.com.swvalerian.basepatterns.behavioral.visitor;

public class Project implements ProjectElement {
    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new ProjectClass(),
                new Biblioteka(),
                new Test()
        };
    }

    @Override
    public void beWriting(BookWriter bookWriter) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.beWriting(bookWriter);
        }
    }
}
