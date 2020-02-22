package pl.codegym.task.task04.task0439;

/* 
Łańcuszek
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (int i=0 ; i < 10 ; i++) {
            System.out.println(name + " mnie kocha.");
        }
    }
}
