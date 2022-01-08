package day1.InterfaceUseCase;

import day1.InterfaceUseCase.Objects.Airplane;
import day1.InterfaceUseCase.Objects.Hen;

public class Main {
    public static void main(String[] args) {
        /*
        *  Sell the object which can fly. . .
        *
         */

        Seller seller = new Seller();
        Airplane airplane = new Airplane();
        Hen hen = new Hen();

        seller.sell(airplane);
        seller.sell(hen);

    }

}
