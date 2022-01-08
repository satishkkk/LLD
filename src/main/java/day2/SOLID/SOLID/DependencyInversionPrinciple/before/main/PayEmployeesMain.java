package day2.SOLID.SOLID.DependencyInversionPrinciple.before.main;

import day2.SOLID.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessor;

public class PayEmployeesMain {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
