package com.loong.stream;

import java.util.List;

import static java.util.stream.Collectors.toSet;

public class Example_map {
    public static void main(String[] args) {

        List<Person> javaProgrammers =Constant.javaProgrammers;

        javaProgrammers.forEach(System.out::println);

        javaProgrammers.stream()
                .map(Person::getFirstName)
                .collect(toSet()).forEach(System.out::println);

    }
}
