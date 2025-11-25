package org.PatternDesign;

import org.PatternDesign.Adapter.EmployeeAdapter;
import org.PatternDesign.Adapter.ITraget;
import org.PatternDesign.Factory.DataAnalyticsEngine;
import org.PatternDesign.Factory.DatabaseFactory;
import org.PatternDesign.Factory.DatabaseType;
import org.PatternDesign.Observer.ConcreteObserver;
import org.PatternDesign.Observer.Subject;

public class Program {

       public static void main(String[] args) {
                try {
                        dbEngines();
                        Thread.sleep(2000);
                        System.out.println();

                        employeesAdapterDemo();
                        Thread.sleep(2000);
                        System.out.println();

                        observingThings();
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

        static void observingThings() {
                Subject RedMI = new Subject("Red MI Mobile", 10000, "Out Of Stock");

                ConcreteObserver user1 = new ConcreteObserver("Anurag");
                user1.AddSubscriber(RedMI);

                ConcreteObserver user2 = new ConcreteObserver("Pranaya");
                user2.AddSubscriber(RedMI);

                ConcreteObserver user3 = new ConcreteObserver("Priyanka");
                user3.AddSubscriber(RedMI);

                try {
                        Thread.sleep(1000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                user3.RemoveSubscriber(RedMI);

                try {
                        Thread.sleep(1000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                RedMI.setAvailability("Available");
        }
}
