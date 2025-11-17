package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {


    private List<Track> tracks = new ArrayList<>();
    private List<String> artists = new ArrayList<>(); 
    private List<String> directors = new ArrayList<>(); 
    

    public CompactDisc(String title, String category, double cost, List<Track> tracks, List<String> artists, List<String> directors) {
        super(title,cost,category);
        this.tracks = tracks;
        this.artists = artists;
        this.directors = directors;
    }
    
    
    public List<Track> getTracks() { return tracks; }
    public List<String> getArtists() { return artists; }
    public List<String> getDirector(){return directors; }
    
   
    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }

   
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track '" + track.getTitle() + "' is already in the CD.");
        } else {
            tracks.add(track);
            System.out.println("Track '" + track.getTitle() + "' added successfully.");
        }
    }

    
    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Track '" + track.getTitle() + "' removed successfully.");
        } else {
            System.out.println("Track '" + track.getTitle() + "' not found in the CD.");
        }
    }

    
    
    public String toString() {
        String artistsStr = String.join(", ", artists);
        
        return super.toString()
                + "\n  Total Length: " + this.totalLength() + " min"
                + "\n  Artists: " + artistsStr
                + "\n  Tracks Count: " + this.tracks.size();
    }
}
