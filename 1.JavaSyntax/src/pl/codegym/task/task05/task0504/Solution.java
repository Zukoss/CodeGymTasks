package pl.codegym.task.task05.task0504;

/* 
Trzej Muszkoterowie
*/

public class Solution {
    public static void main(String[] args) {
        Kot kot1 = new Kot("Skalpel", 3,7,20);
        Kot kot2 = new Kot("Pusia",5,15,10);
        Kot kot3 = new Kot("Szogun",2,5,20);

    }

    public static class Kot {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }
    }
}