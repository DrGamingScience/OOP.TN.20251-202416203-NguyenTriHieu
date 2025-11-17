package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class NoGarbage {

    public static void main(String[] args) throws IOException { 
        String filename = "D:\\OOP\\OOP.TN.20251-202416203-NguyenTriHieu\\OtherProject\\src\\com\\hust\\kstn\\garbage\\test.txt";
        
        byte[] inputBytes = {};
        long startTime, endTime;

        
        inputBytes = Files.readAllBytes(Paths.get(filename));
        
        startTime = System.currentTimeMillis();
        
        String outputString = "";
        
      
        StringBuilder sb = new StringBuilder(inputBytes.length); 
        for (byte b : inputBytes) {
            sb.append((char) b);
        }
        
        outputString = sb.toString(); 
        
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}