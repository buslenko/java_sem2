package com.company.Java_sem2.task8.Mediator;

class User {
    private String name;
    public User(String name){
        this.name  = name;
    }
    public String getName() {
        return name;
    }
    public void sendMessage(String msg){
        Mediator.sendMessage(this, msg);
    }
}
