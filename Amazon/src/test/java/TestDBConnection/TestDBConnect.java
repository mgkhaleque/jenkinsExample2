package TestDBConnection;
import DBConnection.DBConnect;
public class TestDBConnect {
    //Create instance of DBConnect Class
    //this will create a connect variable type of DBConnect while running program
    //and it will try to load the driverClass
    public static void main(String[] args) {
        DBConnect connect = new DBConnect();
        connect.getData();
    }
}






