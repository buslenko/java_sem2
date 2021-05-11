package com.company.Java_sem2.task8.Mediator;

public class Mediator1 {//тест
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        user1.sendMessage("message1");
        user2.sendMessage("message2");
    }
}
