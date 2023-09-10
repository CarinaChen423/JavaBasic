package org.example;

class Person{
    //Instance variables(data or state)
    String name;
    int age;


    //Classes can contain: 1.Data 2.Subroutines(methods)
    void speak(){
        for(int i=0;i<3;i++){
            System.out.println("My name is "+name+" and I am "+age+" years old");
        }
    }

    void sayHello(){
        System.out.println("Hello there!");

    }

}
public class Objects {
    public static void main(String[] args) {
        //Create an object
        Person person1=new Person();
        person1.name="Mirage";
        person1.age=3;
        person1.speak();
        person1.sayHello();

        Person person2=new Person();
        person2.name="FaCai";
        person2.age=2;
        person2.speak();
        person2.sayHello();

        System.out.println(person1.name);
    }
}
