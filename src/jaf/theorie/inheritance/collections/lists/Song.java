package jaf.theorie.inheritance.collections.lists;

public record Song(String title, String artist, int length) implements Comparable<Song> {
    public Song(String title, String artist, String length) {
        this(title, artist, parseLength(length));
    }

    @Override
    public int compareTo(Song o) {
        return Integer.compare(length, o.length);
    }

    private static int parseLength(String length) {
        var items = length.split(":");
        if (items.length < 1 || items.length > 2) return -1;
        var minutes = Integer.parseInt(items[0]);
        var seconds = items.length == 2 ? Integer.parseInt(items[1]) : 0;
        return minutes * 60 + seconds;
    }
}
