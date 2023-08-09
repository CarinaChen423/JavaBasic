package org.example;

import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //While Loops: when you don't know how many times need to repeat; check condition first
        //do while loops: executed once
        Scanner scanner=new Scanner(System.in);
        String input="";
        while(!input.equals("quit"))
        {
            System.out.println("Input:");
            input= scanner.next().toLowerCase();

        }
    }
}
