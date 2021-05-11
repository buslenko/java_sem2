package com.company.Java_sem2.task7.Decorator;

class BlueCarDecorator extends CarDecorator {
    public BlueCarDecorator(Car decorated) {
        super(decorated);
    }
    public void draw() {
        decorated.draw();
        setColor();
    }
    private void setColor(){
        System.out.println("Color: red");
    }
}
