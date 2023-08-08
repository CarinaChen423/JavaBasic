package org.example;

public class ControlFlow {
    public static void main(String[] args) {
        //comparison operators
        int x=1;
        int y=1;
        System.out.println(x==y);

        boolean HigIncome=true;
        boolean GoodCredit=true;
        boolean CriminalRecord=false;
        boolean Eligible=(HigIncome||GoodCredit)&&!CriminalRecord;
//If Statement
        int temp=32;
        if(temp>30) {
            System.out.println("It's a hot day");
        }else if (temp>20&&temp<=30) {
            System.out.println("Have a nice day!");
        }else
            System.out.println("Cold day");
        }
        int income=120000;
        String className=income>100000?"First":"Economy";









    }

