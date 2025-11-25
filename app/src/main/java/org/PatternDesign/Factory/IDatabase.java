package org.PatternDesign.Factory;

public interface IDatabase {

        void Connect();
        void ExecuteQuery(String query);
}
