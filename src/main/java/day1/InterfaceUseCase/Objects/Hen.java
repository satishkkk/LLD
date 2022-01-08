package day1.InterfaceUseCase.Objects;

import day1.InterfaceUseCase.Flyable;

public class Hen implements Flyable {

    String name = "Hen";
    @Override
    public void fly() {
        System.out.println("I am Hen , and i can fly please sell me");
    }
}
