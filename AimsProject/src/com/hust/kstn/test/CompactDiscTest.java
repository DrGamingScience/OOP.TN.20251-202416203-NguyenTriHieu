package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CompactDiscTest {

    public static void main(String[] args) {

        Track track1 = new Track("Bohemian Rhapsody", 6);
        Track track2 = new Track("Another One Bites the Dust", 3);
        Track track3 = new Track("We Will Rock You", 2);

        
        List<Track> queenTracks = new ArrayList<>(Arrays.asList(track1, track2));
        List<String> artists = Arrays.asList("Queen", "Freddie Mercury");
        List<String> directors = Arrays.asList("Rudi Dolezal");

        CompactDisc cdQueen = new CompactDisc(
            "Greatest Hits", "Rock", 18.99, 
            queenTracks, artists, directors
        );

       
        System.out.println("Total Length & Info");
        System.out.println(cdQueen.toString());
        System.out.println("Calculated Length: " + cdQueen.totalLength() + " min (Expected: 9)");

       
        System.out.println("Add Track");
        cdQueen.addTrack(track3);
        cdQueen.addTrack(track3); 
        System.out.println("New Length after adding track3: " + cdQueen.totalLength() + " min (Expected: 11)");
        
        
        System.out.println("Remove Track");
        cdQueen.removeTrack(track1); 
        cdQueen.removeTrack(track1); 
        System.out.println(cdQueen.toString());

       
    }
}