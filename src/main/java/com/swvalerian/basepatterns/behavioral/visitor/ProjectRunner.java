package main.java.com.swvalerian.basepatterns.behavioral.visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        BookWriter senior = new SeniorWriter();
        BookWriter jun =new JuniorWriter();

        System.out.println("Jun writer");

        project.beWriting(jun);
        System.out.println("\n======================\n");
        project.beWriting(senior);
    }
}
