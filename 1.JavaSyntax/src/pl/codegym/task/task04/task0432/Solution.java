package pl.codegym.task.task04.task0432;



/* 
Dobrego nigdy zbyt wiele
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int number = sc.nextInt();
        int i = 0;

        while (i < number) {
            i++;
            System.out.println(word);
        }
    }
}
