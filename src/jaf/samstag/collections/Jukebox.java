package jaf.samstag.collections;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Predicate;

record Song(String title, String artist, int rating) {
}

@FunctionalInterface
interface Filter {
    boolean met(Song song);
}

class Jukebox {
    private SortedSet<Song> songs = new TreeSet<>();

    void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getByFilter(Filter filter) {
        List<Song> result = List.of();
        for (Song song : songs) {
            if (filter.met(song)) {
                result.add(song);
            }
        }
        return result;
    }

    public List<Song> getBy(Predicate<Song> predicate) {
        List<Song> result = List.of();
        for (Song song : songs) {
            if (predicate.test(song)) {
                result.add(song);
            }
        }
        return result;
    }
}

class JukeboxMain {
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.addSong(new Song("The Best Of Me", "The Beatles", 10));
        var whatILike = jukebox.getByFilter(
                song -> {
                    if (song.rating() >= 8) {
                        if (!song.artist().equals("The Beatles")) {
                            return true;
                        }
                    }
                    return false;
                }
        );
        System.out.println(whatILike);
        Predicate<Song> predicate = song -> song.rating() >= 8;
        jukebox.getBy(predicate);
    }
}
