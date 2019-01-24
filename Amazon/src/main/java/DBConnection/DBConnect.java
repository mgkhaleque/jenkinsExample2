package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Sequel Pro - for Database
//Driver Download Link - https://dev.mysql.com/downloads/connector/odbc
public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    //this constructor will connect to database thru try/catch block
    public DBConnect(){
        try { //inBetween try/catch we'll loadover driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(" myDatabase");
            st = con.createStatement();
        }catch (Exception ex){  //threw this Exception to catch and display the database
            System.out.println("error: "+ex);
        }
    }
    public void getData(){
        try{
            String query = "select * from myDatabase ";
            rs = st.executeQuery(query);
            System.out.println("Records from Database");
            while (rs.next()){
                String title = rs.getString("title");
                int price =  rs.getInt("price");
                System.out.println("title: "+title+ "Price; "+price);
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        try {

        }catch (NullPointerException ex){
            ex.printStackTrace();
        }
    }
}

