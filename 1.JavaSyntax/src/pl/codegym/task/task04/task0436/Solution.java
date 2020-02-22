package pl.codegym.task.task04.task0436;


/* 
Rysowanie prostokąta
*/
import java.util.Scanner;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();

        for (int i=0; i<y; i++) {
            for (int j=0; j<x; j++) {
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
