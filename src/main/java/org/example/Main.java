package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {

    
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Max", "Maxi", "Maxim", "Maximilian"));

        names.stream()
                .map(String::toUpperCase) //Method Ref.
                .sorted()
                .filter(name -> name.length() < 5) //Lambda
                .forEach(System.out::println);

        names.stream()
                .map(String::toUpperCase) //Method Ref.
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String name) {
                        return name.length() < 5;
                    }
                }) //Lambda
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });

        names.stream()
                .map(String::toUpperCase) //Method Ref.
                .sorted()
                .filter(name -> name.length() < 5) //Lambda
                .forEach(System.out::println);
    }

    //aweressdfghjhtrewrtzhkklöztreewghjk
}