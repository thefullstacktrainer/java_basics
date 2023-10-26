package org.lucky.collections.list;

import java.util.LinkedList;

public class LinkedListExampleWithGames {
    public static void main(String[] args) {
        // Create a LinkedList to store Game objects
        LinkedList<Game> gamesList = new LinkedList<>();

        // Add Game objects to the LinkedList
        gamesList.add(new Game("The Legend of Zelda", "Action-Adventure"));
        gamesList.add(new Game("Minecraft", "Sandbox"));
        gamesList.add(new Game("Super Mario Bros.", "Platformer"));
        gamesList.add(new Game("Fortnite", "Battle Royale"));
        gamesList.add(new Game("The Witcher 3: Wild Hunt", "RPG"));

        // Access and print the Game objects in the LinkedList
        System.out.println("List of Games:");
        for (Game game : gamesList) {
            System.out.println(game);
        }
    }
}