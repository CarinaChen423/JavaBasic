package org.example;

class People{
    String name;
    int age;
    void speak(){
        System.out.println("My name is "+name);
    }
    int calculateYearsToRetirement(){
        int yearsleft=65-age;
        return  yearsleft;
    }

    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }

}
public class GettersAndReturn {
    public static void main(String[] args) {
        People person1=new People();
        person1.name="Joe";
        person1.age=25;
        int years= person1.calculateYearsToRetirement();
        System.out.println("Years till retirement: "+years);
        int age= person1.getAge();
        String name= person1.getName();
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);


    }
}
