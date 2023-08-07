package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[]args){
        final byte Months=12;
        final byte Percent=100;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the principal:");
        int Principal= scanner.nextInt();
        System.out.println("Please enter the Annual Interest Rate:");
        double AnnualInterest= scanner.nextDouble();
        double MonthlyInterest=AnnualInterest/Months/Percent;
        System.out.println("Please enter the Period(Years):");
        int Years= scanner.nextInt();
        int NumberOfPayments=Years*Months;

        double Mortgage=Principal*(MonthlyInterest*Math.pow(1+MonthlyInterest,NumberOfPayments))/
                (Math.pow(1+MonthlyInterest,NumberOfPayments)-1);
        String MortgageFormat= NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage:"+MortgageFormat);

    }


}
