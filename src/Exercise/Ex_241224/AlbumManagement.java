/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241224;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author DUADEPTRAI
 */
public class AlbumManagement {
    private List<Album> albums;
    
    public AlbumManagement(List<Album> albums) {
        this.albums = albums;
    }
    
    public Track getMaxDurationTrack() {
        return albums.stream()
                .flatMap(album -> album.getTracks().stream())
                .max(Comparator.comparingInt(Track::getDuration))
                .orElse(null);
    }
    
    public Track getMinDurationTrack() {
        return albums.stream()
                .flatMap(album -> album.getTracks().stream())
                .min(Comparator.comparingInt(Track::getDuration))
                .orElse(null);
    }
    
    public long countTotalTracks() {
        return albums.stream()
                .flatMap(album -> album.getTracks().stream())
                .count();
    }
    
    public List<Album> filterAlbumsByYear(int year) {
        return albums.stream()
                .filter(album -> album.getReleaseYear() > year)
                .collect(Collectors.toList());
    }
    
    public List<Track> sortTracksByDurationDescending() {
        return albums.stream()
                .flatMap(album -> album.getTracks().stream())
                .sorted((t1, t2) -> Integer.compare(t2.getDuration(), t1.getDuration()))
                .collect(Collectors.toList());
    }
}
