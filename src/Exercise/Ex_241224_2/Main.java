/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241224_2;

import java.util.List;

/**
 *
 * @author DUADEPTRAI
 */
public class Main {
    public static void main(String[] args) {
        AlbumManage album = new AlbumManage();
        
        List<Track> tracks = album.tracks();
        
        Track longestTrack = album.getLongestDuration(tracks);
        System.out.println("Longest Track: " + longestTrack.getTitle()
                            + " - Duration: " + longestTrack.getDuration());
        
        Track shortestTrack = album.getShortestDuration(tracks);
        System.out.println("Shortest Track: " + shortestTrack.getTitle()
                            + " - Duration: " + shortestTrack.getDuration());
        
        long totalTracks = album.countTotalTracks(tracks);
        System.out.println("Total Tracks: " + totalTracks);
    }
}
