package org.PatternDesign.Adapter;

import java.util.List;

public class BillingSystem {

        public void ProcessSalary(List<Employee> listEmployee) {
                for (Employee employee : listEmployee) {
                        System.out.println("Rs." + employee.getSalary() + " Salary Credited to " + employee.getName() + " Account");
                }
        }
}
