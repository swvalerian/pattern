package main.java.com.swvalerian.basepatterns.structural.proxy;

import javax.sound.midi.Soundbank;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from " + url + " ...");
    }

    @Override
    public void run() {
        System.out.println("Starting project " + url + " ...");
    }
}
