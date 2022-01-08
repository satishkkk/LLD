package day2.SOLID.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import day2.SOLID.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import day2.SOLID.SOLID.DependencyInversionPrinciple.before.notification.EmailSender;
import day2.SOLID.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import day2.SOLID.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;

public class PaymentProcessor {


    public int sendPayments(){
    	EmployeeFileSerializer serializer =
                new EmployeeFileSerializer();
    	
    	EmployeeFileRepository employeeRepository = 
    			new EmployeeFileRepository(serializer);
    	
        List<Employee> employees = employeeRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            EmailSender.notify(employee);
        }

        return totalPayments;
    }
}
