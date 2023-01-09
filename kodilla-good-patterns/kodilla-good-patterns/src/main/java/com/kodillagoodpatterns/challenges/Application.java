package com.kodillagoodpatterns.challenges;

import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String titlesWithExclamationMark = movieStore.getMovies().entrySet().stream()
                .flatMap(title -> title.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(titlesWithExclamationMark);
    }
}
