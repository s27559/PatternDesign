package org.PatternDesign.Factory;

import java.util.InputMismatchException;

public class DatabaseFactory {

        public static IDatabase CreateDatabase(DatabaseType databaseType){
                IDatabase database = null;
                switch (databaseType) {
                        case DatabaseType.SqlServer:
                                database = new SqlServerDatabase();
                                break;

                        case DatabaseType.Oracle:
                                database = new OracleDatabase();
                                break;

                        default:
                                throw new InputMismatchException("Unsupported database type");
                }
                return database;
        }
}
