package org.PatternDesign.Adapter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements ITraget{

        private final BillingSystem thirdPartyBillingSystem = new BillingSystem();

        @Override
        public void ProcessCompanySalary(String[][] employeesArray) {
                thirdPartyBillingSystem.ProcessSalary(string2dArrToEmpList(employeesArray));
        }

        private static List<Employee> string2dArrToEmpList(String[][] employeesArray) {
                ArrayList<Employee> employees = new ArrayList<>();
                for (String[] row : employeesArray) {
                        employees.add(new Employee(
                                Integer.parseInt(row[0]),
                                row[1],
                                row[2],
                                new BigDecimal(row[3])
                        ));
                }
                return employees;
        }
}
