package com.company.Java_sem2.task2;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> listOfHumans = new ArrayList<>();

        listOfHumans.add(new Human(18, "Сергей", "Иванов", LocalDate.of(2000,12,1), 95));
        listOfHumans.add(new Human(19, "Анатолий", "Сидоров", LocalDate.of(2003,9,9), 92));
        listOfHumans.add(new Human(25, "Степан", "Петров", LocalDate.of(2004,2,28), 70));
        listOfHumans.add(new Human(30, "Данил", "Оконцев", LocalDate.of(2002,5,17), 85));

        listOfHumans.stream().sorted(Comparator.comparing(Human::getWeight).reversed()).forEach(System.out::println);

        System.out.println();

        listOfHumans.stream().filter(human -> !human.getLastName().equals("Иванов")).forEach(System.out::println);

        System.out.println();

        listOfHumans.stream().sorted(Comparator.comparing(Human::getAge)).forEach(System.out::println);
        System.out.println();
        Stream<Human> humans = listOfHumans.stream();
        int sum = 1;
        sum *= humans.mapToInt(Human::getAge).reduce(1,(a, b) -> a*b);

        System.out.println(sum);
    }
}
