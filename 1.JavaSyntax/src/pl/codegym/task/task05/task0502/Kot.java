package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

public class Kot {

    public int wiek;
    public int waga;
    public int sila;

    public Kot() {
    }

    public boolean walka(Kot innyKot) {

        if (this.wiek > innyKot.wiek || this.waga > innyKot.waga || this.sila > innyKot.sila) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Kot kot1 = new Kot();
        Kot kot2 = new Kot();

        kot1.sila = 10;
        kot1.wiek = 5;
        kot1.waga = 8;

        kot2.sila = 8;
        kot2.wiek = 4;
        kot2.waga = 7;

        kot1.walka(kot2);
        kot2.walka(kot1);

    }
}
