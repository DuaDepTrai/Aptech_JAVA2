/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241224;

import java.util.List;

/**
 *
 * @author DUADEPTRAI
 */
public class Album {
    private String id;
    private String title;
    private String artist;
    private int releaseYear;
    private List<Track> tracks;
    
    public Album(String id, String title, String artist, int releaseYear, List<Track> tracks) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }
    
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public List<Track> getTracks() {
        return tracks;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + "\n Title: " + title + " - Artist: " + artist + "\n Release Year: " + releaseYear + "\n Tracks: \n" + tracks + "\n";
    }
}
