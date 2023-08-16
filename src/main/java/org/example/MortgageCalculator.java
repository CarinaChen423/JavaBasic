package org.example;

import java.text.NumberFormat;
import java.time.Year;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte Months = 12;
        final byte Percent = 100;
        int Principal = 0;
        double MonthlyInterest=0;
        int Years=0;
        int NumberOfPayments=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the principal ($1K-$1`M):");

        while (true) {
            System.out.println("Principal:");
            Principal = scanner.nextInt();
            if (Principal >= 1000 && Principal <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }
        while (true) {
            System.out.println("Please enter the Annual Interest Rate:");
            double AnnualInterest = scanner.nextDouble();
            if (AnnualInterest >= 1 && AnnualInterest <= 30) {
                 MonthlyInterest = AnnualInterest / Months / Percent;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        while(true){
        System.out.println("Please enter the Period(Years):");
         Years = scanner.nextInt();
        if(Years>=1 && Years<=30){
            NumberOfPayments = Years * Months;
            break;
        }
            System.out.println("Enter a value between 1 and 30");
        }

        double Mortgage = Principal * (MonthlyInterest * Math.pow(1 + MonthlyInterest, NumberOfPayments)) /
                (Math.pow(1 + MonthlyInterest, NumberOfPayments) - 1);
        String MortgageFormat = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage:" + MortgageFormat);

    }


}
