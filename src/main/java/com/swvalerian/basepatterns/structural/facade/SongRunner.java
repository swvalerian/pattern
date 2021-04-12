package main.java.com.swvalerian.basepatterns.structural.facade;

public class SongRunner {
    public static void main(String[] args) {
        // Фасад нам дает преимущество, и чистый код, вместо комментариев вот что получилось:

        SongSingFacade songSingFacade = new SongSingFacade();
        songSingFacade.singASong();


        /*Song song = new Song();
        song.singSong();

        BugFanera bugFanera = new BugFanera();
        bugFanera.singSong();

        Singer singer = new Singer();
        singer.singSongBeforeHoarse(bugFanera);

        bugFanera.stopSing();
        singer.singSongBeforeHoarse(bugFanera);*/
    }
}
