package org.lucky.collections.list;

public class Game2 {

        private String name;
        private int score;

        public Game2(String name) {
            this.name = name;
            this.score = 0;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        public void play() {
            // Simulate the gameplay logic
            score += (int) (Math.random() * 10);
        }

        @Override
        public String toString() {
            return "Game: " + name + " (Score: " + score + ")";
        }
    }