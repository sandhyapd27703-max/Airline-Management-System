
package airlinemanagementsystem1;


import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //register driver
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "Sandhy@7063");  //create the connection string
            s = c.createStatement();  //create the statement
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
