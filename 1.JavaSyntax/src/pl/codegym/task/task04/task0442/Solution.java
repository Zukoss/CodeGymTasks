package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while (true) {
            int nLiczba = sc.nextInt();
            sum += nLiczba;
            if (nLiczba == -1){
                break;
            }
        }
        System.out.println(sum);
    }
}

