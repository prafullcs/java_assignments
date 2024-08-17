package assignment2;
//Write a Java program to create a class called player with name, age, country Name, total run as instance member. 
// Create 5 player objects and write  instance method to display the details of Player having more than 5000 as total run

import java.util.ArrayList;

public class Player {
    private String name;
    private int age;
    private String countryName;
    private int totalRun;

    // Constructor
    public Player(String name, int age, String countryName, int totalRun) {
        this.name = name;
        this.age = age;
        this.countryName = countryName;
        this.totalRun = totalRun;
    }

    // Method to display player details
    public void displayPlayerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + countryName);
        System.out.println("Total Runs: " + totalRun);
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating player objects
        Player player1 = new Player("Player 1", 25, "Country A", 6000);
        Player player2 = new Player("Player 2", 28, "Country B", 4500);
        Player player3 = new Player("Player 3", 30, "Country C", 7000);
        Player player4 = new Player("Player 4", 32, "Country D", 5200);
        Player player5 = new Player("Player 5", 27, "Country E", 4800);

        // Adding players to a list
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        // Displaying details of players with more than 5000 total runs
        System.out.println("Players with more than 5000 total runs:");
        for (Player player : players) {
            if (player.totalRun > 5000) {
                player.displayPlayerDetails();
            }
        }
    }
}

