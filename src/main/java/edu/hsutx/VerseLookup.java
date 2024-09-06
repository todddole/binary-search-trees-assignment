package edu.hsutx;

import java.util.Scanner;

public class VerseLookup {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        BibleTree bible = new BibleTree("data/reordered_geneva.txt");
        System.out.print("Please enter a scripture reference:");
        String ref = kb.nextLine();
        System.out.print(bible.getVerse(ref));
    }
}
