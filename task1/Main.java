package com.company.Java_sem2.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0, k = 0;
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        if (word.equals("end")) {
            k = 1;
        }

        while (k != 1) {
            arrayList.add(i, word);
            i++;
            word = console.nextLine();
            if (word.equals("end")) {
                k = 1;
            }
        }
        Functionalinterface string_reverse = x -> {
            StringBuilder newStr = new StringBuilder((String) x);
            newStr.reverse();
            return newStr;
        };
        for (int j = 0; j < i; j++) {
            String arrayElement = arrayList.get(j);
            System.out.println(string_reverse.apply(arrayElement));
        }
        return;
    }
}

