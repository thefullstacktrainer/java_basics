package org.lucky.collections.queue;

import java.util.*;

public class  GameStatistics {
    public static void main(String[] args) {
        PriorityQueue<Player> leaderboard = new PriorityQueue<Player>(5, new PlayerComparator());

        // Simulate players' scores in the game
        leaderboard.add(new Player("Amit", 1200));
        leaderboard.add(new Player("Vijay", 1500));
        leaderboard.add(new Player("Karan", 1350));
        leaderboard.add(new Player("Jai", 1100));
        leaderboard.add(new Player("Rahul", 1600));

        System.out.println("Top players based on their scores:");

        Iterator<Player> iterator = leaderboard.iterator();
        while (iterator.hasNext()) {
            Player player = iterator.next();
            System.out.println(player.name + " - Score: " + player.score);
        }

        // Player "Rahul" logs out and is removed from the leaderboard
        leaderboard.poll();

        System.out.println("\nAfter removing the lowest-scoring player:");

        Iterator<Player> iterator2 = leaderboard.iterator();
        while (iterator2.hasNext()) {
            Player player = iterator2.next();
            System.out.println(player.name + " - Score: " + player.score);
        }
    }

    static class PlayerComparator implements Comparator<Player> {
        @Override
        public int compare(Player player1, Player player2) {
            return player2.score - player1.score;
        }
    }
}