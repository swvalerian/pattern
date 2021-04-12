package main.java.com.swvalerian.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class SingerFlyWeight {
    private static final Map<MusicDirection, Singer> singers = new HashMap<>();

    public Singer getSingerByMusicDirection(MusicDirection musicDirection) {
        Singer singer = singers.get(musicDirection);

        if (singer == null) {
            switch (musicDirection) {
                case HardRock :
                    System.out.println("Hiring HaviMetall singer...");
                    singer = new HaviMetalSinger();
                    break;
                case SektorGaza:
                    System.out.println("Hiring SectorGaza singer ...");
                    singer = new SektorGazaSinger();
            }
            singers.put(musicDirection, singer);
        }
        return singer;
    }
}
