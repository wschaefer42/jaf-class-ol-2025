package jaf.theorie.inheritance.collections.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Jukebox {
    private final SortedSet<Song> songs;

    public Jukebox() {
        songs = new TreeSet<>();
        songs.addAll(List.of(
                new Song("Purple Rain", "Prince", "8:20"),
                new Song("Take on me", "a-ha", "3:50"),
                new Song("West End Girls", "Pet Shop Boys", "4:15"),
                new Song("The Best", "Tina Turner", "4:13"),
                new Song("Kiss from a Rose", "Seal", "4:48"),
                new Song("Light my Fire", "The Doors", "7:09")
        ));
    }

    public List<Song> getSongsLongerThan(int seconds) {
        var result = new ArrayList<Song>();
        for (Song song : songs) {
            if (song.length() >= seconds) {
                result.add(song);
            }
        }
        return result;
    }

    public List<Song> getAllFullfils(Fullfills filter) {
        var result = new ArrayList<Song>();
        for (Song s : songs) {
            if (filter.fullfills(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Song> getAllThat(Predicate<Song> predicate) {
        var result = new ArrayList<Song>();
        for (Song s : songs) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        System.out.println(jukebox.getSongsLongerThan(400));
        var mysongs = jukebox.getAllFullfils(s -> {
            if (s.artist().equals("Tina Turner")) {
                if (s.length() >= 400) {
                    return true;
                }
            }
            return false;
        });
        var songs2 = jukebox.getAllThat(s -> s.artist().equals("Tina Turner"));
        mysongs.forEach(System.out::println);
    }
}
