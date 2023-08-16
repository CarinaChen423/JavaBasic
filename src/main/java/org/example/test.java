package org.example;

import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //For each
        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String fruit : fruits)
            System.out.println(fruit);

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]); //returns the item at the given index

        //While Loops: when you don't know how many times need to repeat; check condition first
        //do while loops: executed once
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) //or (true)
        {
            System.out.println("Input:");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);

        }
    }

    }

