package Synchronised;

public class DbConnection {
    private static DbConnection dbConnection;
    private DbConnection(){}
    synchronized public static DbConnection getInstance(){
        if(dbConnection==null){
            dbConnection=new DbConnection();
        }
        return dbConnection;
    }
}
