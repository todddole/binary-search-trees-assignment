package edu.hsutx;


public class PrintTheBible {
    public static void main(String[] args) {
        BibleTree bible = new BibleTree("data/reordered_geneva.txt");
        bible.printBible();
    }
}
