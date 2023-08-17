package org.example;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 72);

        // Retrieving values
        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Updating a value
        studentScores.put("Bob", 90);

        // Removing a key-value pair
        studentScores.remove("Charlie");

        // Iterating through key-value pairs
        for (String name : studentScores.keySet()) {
            int score = studentScores.get(name);
            System.out.println(name + "'s score: " + score);
        }
    }
}
