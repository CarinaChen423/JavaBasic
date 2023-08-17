package org.example;

import java.util.Scanner;

public class FizzBuzzExercise {
    public static void main(String[] args) {
     //FizzBuzz Exercise
        // divisible by 5>fizz; divisible by 3>buzz; divisible both 5&3>fizzbuzz; not divisible by 5or3>print itself

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number= scanner.nextInt();
        if(number % 5 ==0 && number % 3 !=0){
            System.out.println("Fizz");
        } else if (number % 3 == 0 && number % 5 !=0) {
            System.out.println("Buzz");
        } else if (number % 5 ==0 && number % 3 ==0) {
            System.out.println("FizzBuzz");
        } else System.out.println(number);

    }


}
