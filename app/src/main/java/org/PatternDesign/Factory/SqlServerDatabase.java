package org.PatternDesign.Factory;

public class SqlServerDatabase implements IDatabase{

        @Override
        public void Connect() {
                System.out.println("Connecting to SQL Server database...");
        }

        @Override
        public void ExecuteQuery(String query) {
                System.out.println("Executing query in SQL Server database: " + query);
        }

        
}
