package main;

import ReadFromFile.GrepDataFromFile;
import ReadFromFile.Holder;
import ReadFromFile.ParsFile;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    @SuppressWarnings("default")
    public static void main(String[] args) {
        GrepDataFromFile result1 = new GrepDataFromFile();
        // result1.displayData();
        ParsFile result2 = new ParsFile();
        LinkedList<Map <String, Holder>> holder = result2.dataMap();
        // System.out.println("ISBN: " + holder.get(""));
    }
}

// for (Map <String, Holder> map : holder) {
//     System.out.println("ISBN: " + map.get("ISBN"));
//     System.out.println("Title: " + map.get("Title"));
//     System.out.println("Author: " + map.get("Author"));
//     System.out.println("Year: " + map.get("Year"));
//     System.out.println("Genre: " + map.get("Genre"));
// }         
