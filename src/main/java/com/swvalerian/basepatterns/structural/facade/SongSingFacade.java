package main.java.com.swvalerian.basepatterns.structural.facade;

public class SongSingFacade {
    Singer singer = new Singer();
    Song song = new Song();
    BugFanera bugFanera = new BugFanera();

    public void singASong() {
        bugFanera.singSong();
        singer.singSongBeforeHoarse(bugFanera);
        song.singSong();
    }

}
