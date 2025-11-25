package org.PatternDesign.Factory;

public class OracleDatabase implements IDatabase {

        @Override
        public void Connect() {
                System.out.println("Connecting to Oracle database...");
        }

        @Override
        public void ExecuteQuery(String query) {
                System.out.println("Executing query in Oracle database: " + query);
        }
 
}
