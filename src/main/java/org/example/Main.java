package org.example;

import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //primitive types in java
    long type=1_2781_7L;
    float t=1213.99F;
        int age = 28;
        char grade = 'A';
        boolean late = true;
        byte b = 20;
        long num1 = 1234567;
        short no = 10;
        float k = (float)12.5;
        double pi = 3.14;
        String message="  Hello\nXiaomi\n";
        System.out.println(message);

        Date now=new Date();
        System.out.println(now);

        int[][]numbers=new int[2][3];
        numbers[0][1]=1;
        System.out.println(Arrays.deepToString(numbers));

        int x=1;int y=x++; //y=1 x=2 give y as x value first
        int z=1;int w=++x; //z=2 w=2 plus x first

        //implicit casting
        //byte>short>int>long>float>double
        double q=1.1;
        double s=q+2; //2>>2.0 int transformed to double
        int c=(int)q+2; //1+2=3
        System.out.println(s);
        System.out.println(c);

        String v="1";
        int n=Integer.parseInt(v)+2;

        Math.ceil(5.5) ;// Answer 6, rounds up.
        Math.round(5.5) ;// Answer 6, rounds to the closest whole number.
        Math.floor(5.5) ;// Answer 5, rounds down.
        int result=Math.max(1,2);
        double results=Math.random();
        System.out.println(results);
// ceil is short for ceiling(up), floor is down...

       String r=NumberFormat.getPercentInstance().format(4.5);
        System.out.println(r);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Name:");
        String name=scanner.nextLine().trim(); //nextLine can store whole name, trim method will cut space
        System.out.println("You are"+name);






  }
}




