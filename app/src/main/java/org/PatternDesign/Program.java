package org.PatternDesign;

import org.PatternDesign.Factory.DataAnalyticsEngine;
import org.PatternDesign.Factory.DatabaseFactory;
import org.PatternDesign.Factory.DatabaseType;

public class Program {

       public static void main(String[] args) {
                try {
                        dbEngines();
                        Thread.sleep(2000);
                        System.out.println();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
       }
        
        public static void dbEngines() {
                DataAnalyticsEngine sqlEngine = new DataAnalyticsEngine(DatabaseFactory.CreateDatabase(DatabaseType.SqlServer));
                sqlEngine.ProcessData("Query to process data for SQL Server");

                DataAnalyticsEngine oracleEngine = new DataAnalyticsEngine(DatabaseFactory.CreateDatabase(DatabaseType.Oracle));
                oracleEngine.ProcessData("Query to process data for Oracle");
        }
}
