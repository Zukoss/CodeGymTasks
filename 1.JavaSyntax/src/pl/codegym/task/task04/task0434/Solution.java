package pl.codegym.task.task04.task0434;


/* 
Tabliczka mnożenia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int e = 1;
        int f = 1;
        int g = 1;
        int h = 1;
        int i = 1;
        int j = 1;

        while (x < 10) {
            x++;
            System.out.println(a+++" "+b++*2+" "+c++*3+" "+d++*4+" "+e++*5+" "
                    +f++*6+" "+g++*7+" "+h++*8+" "+i++*9+" "+j++*10);
        }
    }
}
