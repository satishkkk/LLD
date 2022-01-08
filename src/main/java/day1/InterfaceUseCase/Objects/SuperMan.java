package day1.InterfaceUseCase.Objects;

import day1.InterfaceUseCase.Flyable;

public class SuperMan implements Flyable {
    String name = "SuperMan";
    @Override
    public void fly() {
        System.out.println(" I am superman and i can fly, please sell me");
    }
}
