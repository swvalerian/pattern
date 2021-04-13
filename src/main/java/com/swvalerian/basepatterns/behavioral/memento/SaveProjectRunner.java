package main.java.com.swvalerian.basepatterns.behavioral.memento;

import javax.sound.midi.Soundbank;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo git = new GitHubRepo();

        System.out.println("P creat");
        project.setVersionAndDate("P Version 1.0");

        System.out.println("P info:");
        System.out.println(project.toString());

        System.out.println("P saving to Git");
        git.setSave(project.save());

        System.out.println("P updating");
        Thread.sleep(1000);
        project.setVersionAndDate("P ver 2.0");

        System.out.println(project);

        System.out.println("rollback");
        project.Load(git.getSave());

        System.out.println(project);

        Thread.sleep(1000);
        project.setVersionAndDate("ver 3.0");
        System.out.println(project);

        git.setSave(project.save());

        project.Load(git.getSave());
        System.out.println(project);
    }
}
