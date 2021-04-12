package main.java.com.swvalerian.basepatterns.behavioral.iterator;

public class RockSingerRunner {
    public static void main(String[] args) {
        String[] songs = {"Ramstein", "Ac-DC","DDT","Aria","SectorGaza"};
        RockSinger rockSinger = new RockSinger("Lev Tolstoy", songs);

        Iterator iterator = rockSinger.getIterator();
        System.out.println("Singer: " + rockSinger.getName());
        System.out.println("Songs: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
