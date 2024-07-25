package Lab3_Michael_Zhao.DataBase;

public interface Transaction {
    // Method to start a transaction
    void startTransaction();

    // Method to commit a transaction
    void commit();

    // Method to rollback a transaction
    void rollback();
}
