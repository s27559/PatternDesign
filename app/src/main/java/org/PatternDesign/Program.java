package org.PatternDesign;

import org.PatternDesign.Adapter.EmployeeAdapter;
import org.PatternDesign.Adapter.ITraget;
import org.PatternDesign.Factory.DataAnalyticsEngine;
import org.PatternDesign.Factory.DatabaseFactory;
import org.PatternDesign.Factory.DatabaseType;

public class Program {

       public static void main(String[] args) {
                try {
                        dbEngines();
                        Thread.sleep(2000);
                        System.out.println();

                        employeesAdapterDemo();
                        Thread.sleep(2000);
                        System.out.println();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
        }

        static void dbEngines() {
                DataAnalyticsEngine sqlEngine = new DataAnalyticsEngine(DatabaseFactory.CreateDatabase(DatabaseType.SqlServer));
                sqlEngine.ProcessData("Query to process data for SQL Server");

                DataAnalyticsEngine oracleEngine = new DataAnalyticsEngine(DatabaseFactory.CreateDatabase(DatabaseType.Oracle));
                oracleEngine.ProcessData("Query to process data for Oracle");
        }

        static void employeesAdapterDemo() {
                String[][] employeesArray = {
                        {"101","John","SE","10000"},
                        {"102","Smith","SE","20000"},
                        {"103","Dev","SSE","30000"},
                        {"104","Pam","SE","40000"},
                        {"105","Sara","SSE","50000"}
                };

                System.out.println("HR system passes employee string array to Adapter\n");
                ITraget traget = new EmployeeAdapter();
                traget.ProcessCompanySalary(employeesArray);
        }
}
