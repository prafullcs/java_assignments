package assignment4;       

//part2 (program2 of collection)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//main_class

 public class PlayerManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Player");
            System.out.println("2. Display player with maximum runs");
            System.out.println("3. Sort players by name");
            System.out.println("4. Remove players with less than 100 runs");
            System.out.println("5. Update category of players");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addPlayer(scanner, players);
                    break;
                case 2:
                    displayPlayerWithMaxRuns(players);
                    break;
                case 3:
                    sortPlayersByName(players);
                    break;
                case 4:
                    removePlayersWithLessRuns(players);
                    break;
                case 5:
                    updateCategoryOfPlayers(players);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }

    private static void addPlayer(Scanner scanner, ArrayList<Player> players) {
        System.out.print("Enter player name: ");
        String playerName = scanner.nextLine();
        System.out.print("Enter total runs: ");
        int totalRuns = scanner.nextInt();

        System.out.print("Enter number of wickets: ");
        int noOfWickets = scanner.nextInt();
        System.out.print("Enter number of matches: ");
        int noOfMatches = scanner.nextInt();
        scanner.nextLine(); 
   
        System.out.print("Enter country: ");
        String country = scanner.nextLine();
        System.out.print("Enter number of centuries: ");
        int numberOfCenturies = scanner.nextInt();

        Player player = new Player(playerName, totalRuns, noOfWickets, noOfMatches, country, numberOfCenturies);
        players.add(player);
        System.out.println("Player added successfully.");
    }

    private static void displayPlayerWithMaxRuns(ArrayList<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players found.");
            return;
        }

        Player maxRunPlayer = Collections.max(players, Comparator.comparing(Player::getTotalRuns));
        System.out.println("Player with maximum runs:");
        System.out.println(maxRunPlayer);
    }

    private static void sortPlayersByName(ArrayList<Player> players) {
        if (players.isEmpty()) {
            System.out.println("No players found.");
            return;
        }

        players.sort(Comparator.comparing(Player::getPlayerName));
        System.out.println("Players sorted by name:");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    private static void removePlayersWithLessRuns(ArrayList<Player> players) {
        players.removeIf(player -> player.getTotalRuns() < 100);
        System.out.println("Players with less than 100 runs removed successfully.");
    }

    private static void updateCategoryOfPlayers(ArrayList<Player> players) {
        for (Player player : players) {
            if (player.getNumberOfCenturies() >= 10) {
                player.setCategory("A");
            } else {
                player.setCategory("B");
            }
        }
        System.out.println("Category of players updated successfully.");
    }
}
