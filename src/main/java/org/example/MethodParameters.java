package org.example;

class Robot{
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping: "+height);
    }
    public void move(String direction,double distance){
        System.out.println("Moving "+distance+" metres in direction "+direction);
    }
}

public class MethodParameters {
    public static void main(String[] args) {
        Robot fivew=new Robot();
        fivew.speak("Hi I'm 550W");
        fivew.jump(70484);
        fivew.move("West",13.5);
        String greeting="Hello World";
        fivew.speak(greeting);

        int value=15;
        fivew.jump(value);

    }
}
