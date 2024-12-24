/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241224;

import java.util.*;

/**
 *
 * @author DUADEPTRAI
 */
public class Main {
    public static void main(String[] args) {
        List<Track> tracks1 = Arrays.asList(
                new Track("1", "Shape of You", 240),
                new Track("2", "Perfect", 265),
                new Track("3", "Galway Girl", 210)
        );

        List<Track> tracks2 = Arrays.asList(
                new Track("4", "Blank Space", 230),
                new Track("5", "Shake It Off", 239),
                new Track("6", "Style", 220)
        );

        Album album1 = new Album("1", "Divide", "Ed Sheeran", 2017, tracks1);
        Album album2 = new Album("2", "1989", "Taylor Swift", 2014, tracks2);

        List<Album> albums = Arrays.asList(album1, album2);

        AlbumManagement albumManage = new AlbumManagement(albums);

        // Test Methods
        System.out.println("Track with max duration: " + albumManage.getMaxDurationTrack());
        System.out.println("Track with min duration: " + albumManage.getMinDurationTrack());
        System.out.println("Total tracks: " + albumManage.countTotalTracks());
        System.out.println("Albums released after 2015: \n" + albumManage.filterAlbumsByYear(2015));
        System.out.println("Tracks sorted by duration descending: \n" + albumManage.sortTracksByDurationDescending());
    }
}
