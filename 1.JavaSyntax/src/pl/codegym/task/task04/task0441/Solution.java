package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b && b>c) {
            System.out.println(b);
        }
        else if (c>b && b>a) {
            System.out.println(b);
        }
        else if (b>a && a>c) {
            System.out.println(a);
        }
        else if (c>a && a>b) {
            System.out.println(a);
        }
        else if (a>c && c>b) {
            System.out.println(c);
        }
        else if (b>c && c>a) {
            System.out.println(c);
        }
        else if (a==c && b>c || b<c) {
            System.out.println(a);
        }
        else if (b==a && a>c || a<c) {
            System.out.println(b);
        }
        else if (c==b && b>a || b<a) {
            System.out.println(c);
        }
        else if (a==b && b==c && c==a) {
            System.out.println(b);
        }
    }
}
