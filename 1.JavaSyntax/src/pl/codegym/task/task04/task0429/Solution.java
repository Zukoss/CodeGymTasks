package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int dodatnie = 0;
        int ujemne = 0;

        if (a>0) {
            dodatnie++;
        }
        if (a<0){
            ujemne++;
        }
        if (b>0) {
            dodatnie++;
        }
        if (b<0) {
            ujemne++;
        }
        if (c>0) {
            dodatnie++;
        }
        if (c<0) {
            ujemne++;
        }

        System.out.println("Liczba liczb ujemnych: "+ujemne);
        System.out.println("Liczba liczb dodatnich: "+dodatnie);
    }
}
