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
public class AlbumManage {
    public List<Track> tracks() {
        Track track1 = new Track(1, "Bohemian Rhapsody", 354);
        Track track2 = new Track(2, "Stairway to Heaven", 482);
        Track track3 = new Track(3, "Hotel California", 391);
        Track track4 = new Track(4, "Imagine", 183);
        Track track5 = new Track(5, "Hey Jude", 431);
        Track track6 = new Track(6, "Sweet Child O' Mine", 356);
        Track track7 = new Track(7, "Smells Like Teen Spirit", 301);
        Track track8 = new Track(8, "Wonderwall", 259);
        Track track9 = new Track(9, "Billie Jean", 294);
        Track track10 = new Track(10, "Purple Rain", 445);
        
        return List.of(track1, track2, track3, track4, track5, 
                track6, track7, track8, track9, track10);
    }
    
    public Track getLongestDuration(List<Track> tracks) {
        return tracks.stream()
                .max((t1, t2) -> Integer.compare(t1.getDuration(), t2.getDuration()))
                .orElse(null);
    }
    
    public Track getShortestDuration(List<Track> tracks) {
        return tracks.stream()
                .min((t1, t2) -> Integer.compare(t1.getDuration(), t2.getDuration()))
                .orElse(null);
    }
    
    public long countTotalTracks(List<Track> tracks) {
        return tracks.stream()
                .map(Track::getTitle)
                .distinct()
                .count();
    }
}
