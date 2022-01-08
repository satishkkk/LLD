package day1.InterfaceUseCase.Objects;

import day1.InterfaceUseCase.Flyable;

public class Airplane implements Flyable {

    String name = "Airplane";

    @Override
    public void fly() {
        System.out.println(" I am Airplane and i can fly please sell me");
    }

    public void tryit(){
        System.out.println("tryit");
    }
}
