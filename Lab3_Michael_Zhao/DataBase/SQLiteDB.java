package Lab3_Michael_Zhao.DataBase;

public class SQLiteDB extends Database implements Transaction {
    // Implementing the connect method
    public void connect() {
        // Logic to connect to a SQLite database
        System.out.println("Connected to SQLite database.");
    }

    // Implementing the disconnect method
    public void disconnect() {
        // Logic to disconnect from a SQLite database
        System.out.println("Disconnected from SQLite database.");
    }

    // Implementing the executeQuery method
    public void executeQuery(String query) {
        // Logic to execute a SQL query on a SQLite database
        System.out.println("Executing query on SQLite database: " + query);
    }

    // Implementing the startTransaction method
    public void startTransaction() {
        // Logic to start a transaction on a SQLite database
        System.out.println("Starting transaction on SQLite database.");
    }

    // Implementing the commit method
    public void commit() {
        // Logic to commit a transaction on a SQLite database
        System.out.println("Committing transaction on SQLite database.");
    }

    // Implementing the rollback method
    public void rollback() {
        // Logic to rollback a transaction on a SQLite database
        System.out.println("Rolling back transaction on SQLite database.");
    }
}
