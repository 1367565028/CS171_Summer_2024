package Lab3_Michael_Zhao.DataBase;

public class Main {
    public static void main(String[] args) {
        // Creating an SQLiteDB object
        SQLiteDB sqliteDB = new SQLiteDB();

        // Use the SQLiteDB object to connect to the database
        sqliteDB.connect();

        // Start a transaction
        sqliteDB.startTransaction();

        // Execute a SQL query
        sqliteDB.executeQuery("SELECT * FROM users");

        // Commit the transaction
        sqliteDB.commit();

        // Disconnect from the database
        sqliteDB.disconnect();

        // Rollback
        sqliteDB.rollback();
    }
}
