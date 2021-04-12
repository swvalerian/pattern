package main.java.com.swvalerian.basepatterns.behavioral.iterator;

import main.java.com.swvalerian.basepatterns.structural.facade.Song;

public class RockSinger implements Collection {
    private String name;
    private String[] songs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSongs() {
        return songs;
    }

    public void setSongs(String[] songs) {
        this.songs = songs;
    }

    public RockSinger(String name, String[] songs) {
        this.name = name;
        this.songs = songs;
    }

    @Override
    public Iterator getIterator() {
        return new SongIterator();
    }

    private class SongIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < songs.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return songs[index++];
        }
    }
}
