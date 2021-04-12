package main.java.com.swvalerian.basepatterns.structural.facade;

public class Singer {
    public void singSongBeforeHoarse(BugFanera bugFanera) {
        if (bugFanera.isActiveMicrofone()) {
            System.out.println("Singer sing a songs, more and more and more ...");
        } else  {
            System.out.println("Singer go to watercloset....");
        }

    }
}
