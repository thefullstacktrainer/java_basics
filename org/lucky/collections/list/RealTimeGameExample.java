package org.lucky.collections.list;

import java.util.LinkedList;
import java.util.Scanner;

public class RealTimeGameExample {

        public static void main(String[] args) {
            LinkedList<Game2> gameQueue = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);

            // Create and add games to the LinkedList
            gameQueue.add(new Game2("Game A"));
            gameQueue.add(new Game2("Game B"));
            gameQueue.add(new Game2("Game C"));

            System.out.println("Welcome to the Real-Time Game Queue!");

            while (!gameQueue.isEmpty()) {
                Game2 currentGame = gameQueue.poll();

                System.out.println("Playing " + currentGame.getName() + "...");
                currentGame.play();
                System.out.println(currentGame);

                System.out.print("Press Enter to continue to the next game (or type 'quit' to exit): ");
                String userInput = scanner.nextLine();

                if ("quit".equalsIgnoreCase(userInput)) {
                    break;
                }
            }

            System.out.println("Thank you for playing the games!");
        }
    }