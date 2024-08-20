package musicplaylist;

import java.util.LinkedList;

public class MusicPlaylist {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
    }

    public void removeSong(String song) {
        playlist.remove(song);
    }

    public void moveSong(String song, int newPosition) {
        playlist.remove(song);
        playlist.add(newPosition, song);
    }

    public void displayPlaylist() {
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ": " + playlist.get(i));
        }
    }

    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        playlist.addSong("Song 1");
        playlist.addSong("Song 2");
        playlist.moveSong("Song 2", 0);
        playlist.removeSong("Song 1");
        playlist.displayPlaylist();
    }
}
