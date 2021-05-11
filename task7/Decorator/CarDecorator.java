package com.company.Java_sem2.task7.Decorator;

abstract class CarDecorator implements Car {
    protected Car decorated;
    public CarDecorator(Car decorated){
        this.decorated = decorated;
    }
    public void draw(){
        decorated.draw();
    }
}