package org.PatternDesign.Factory;

public class DataAnalyticsEngine {

        private IDatabase _database;

        public DataAnalyticsEngine(IDatabase database) {
                this._database = database;
        }

        public void ProcessData(String query) {
                _database.Connect();
                _database.ExecuteQuery(query);
        }
}
