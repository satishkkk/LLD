package day1.InterfaceUseCase.Objects;

import day1.InterfaceUseCase.Flyable;

public class Eagle implements Flyable {
    String name = "Eagle";
    @Override
    public void fly() {
        System.out.println("I am Eagle and i can fly , please sell me");
    }
}
