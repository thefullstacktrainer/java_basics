package org.lucky.collections.list;

public class Game {
        private String title;
        private String genre;

        public Game(String title, String genre) {
            this.title = title;
            this.genre = genre;
        }

        public String getTitle() {
            return title;
        }

        public String getGenre() {
            return genre;
        }

        @Override
        public String toString() {
            return "Game Title: " + title + " (Genre: " + genre + ")";
        }
    }