package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {

    private static int counter = 0; 

    
    private int id; 
    private String title;
    private String category;
    private double cost;
    
 
    private List<Track> tracks = new ArrayList<>();
    private List<String> artists = new ArrayList<>(); 
    private List<String> directors = new ArrayList<>(); 
    

    public CompactDisc(String title, String category, double cost, List<Track> tracks, List<String> artists, List<String> directors) {
        this.id = ++counter; 
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.tracks = tracks;
        this.artists = artists;
        this.directors = directors;
    }
    
 
    public int getId() { return id; }
    public String getTitle() { return title; }
    public double getCost() { return cost; }
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
        
        return "CompactDisc[" + this.id + "][" + this.title + "][" 
                + this.category + "][" + this.cost + "$]" 
                + "\n  Total Length: " + this.totalLength() + " min"
                + "\n  Artists: " + artistsStr
                + "\n  Tracks Count: " + this.tracks.size();
    }
}