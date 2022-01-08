package day1.InterfaceUseCase;

public class Seller {

    // to identify object that can fly we implemented flyable interface for all the flying object , and that passed as
    // object to sell metod, so all the flying object can

    // LiskovsPrinciple :
    // any subclass object should be substitutable for the superclass object from which it is derived.
    void sell( Flyable flyingObject){
        flyingObject.fly();
        System.out.println(flyingObject.i);

    }
}
