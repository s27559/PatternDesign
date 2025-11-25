package org.PatternDesign.Adapter;

import java.math.BigDecimal;

public class Employee {

        private int ID;
        private String Name;
        private String Designation;
        private BigDecimal Salary;
        
        public Employee(int iD, String name, String designation, BigDecimal salary) {
                ID = iD;
                Name = name;
                Designation = designation;
                Salary = salary;
        }

        public int getID() {
                return ID;
        }

        public void setID(int iD) {
                ID = iD;
        }

        public String getName() {
                return Name;
        }

        public void setName(String name) {
                Name = name;
        }

        public String getDesignation() {
                return Designation;
        }

        public void setDesignation(String designation) {
                Designation = designation;
        }

        public BigDecimal getSalary() {
                return Salary;
        }

        public void setSalary(BigDecimal salary) {
                Salary = salary;
        }


}
