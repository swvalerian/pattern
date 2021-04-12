package main.java.com.swvalerian.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ConcertHall {
    public static void main(String[] args) {
        SingerFlyWeight singerFlyWeight = new SingerFlyWeight();

        List<Singer> singers = new ArrayList<>();

        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.HardRock));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.HardRock));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.HardRock));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.HardRock));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.HardRock));

        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.SektorGaza));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.SektorGaza));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.SektorGaza));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.SektorGaza));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.SektorGaza));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.SektorGaza));
        singers.add(singerFlyWeight.getSingerByMusicDirection(MusicDirection.SektorGaza));

        for (Singer singer : singers) {
            singer.singSong();
        }
    }
}
