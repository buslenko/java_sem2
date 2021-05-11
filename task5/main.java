package com.company.Java_sem2.task5;

public class main {
        public static void main(String[] args) {
            System.out.println(LazySingleton.getInstance());
            System.out.println(EagerSingleton.getInstance());
            System.out.println(EnumSingleton.getInstance());
        }
}
