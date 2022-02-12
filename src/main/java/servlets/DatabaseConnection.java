package servlets;

import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseConnection {

    private static Connection con;

     public Connection getDbConnection() throws ClassNotFoundException, SQLException {

        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://192.168.0.105:5432/test";
        String user = "postgres";
        String password = "postgres";
        Class.forName(driver);
        con= DriverManager.getConnection(url,user,password);
        return con;
     }

    public void addUser(User user)  {

         try {
             String sql = "INSERT INTO user(pid,name,surname,id) VALUES(?,?,?,?)";
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, user.getPid());
             ps.setString(2, user.getName());
             ps.setString(3, user.getSurname());
             ps.setInt(4, user.getAge());
             ps.executeUpdate();

         }catch (SQLException e){
             e.printStackTrace();
         }

    }


}
