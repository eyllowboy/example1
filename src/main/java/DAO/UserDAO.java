package DAO;

import model.User;
import DAO.UserDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    final static String userss = "postgres";
    final static String password = "postgres";
    final static String url = "jdbc:postgresql://192.168.0.105:5432/test";

    public static List<User> getAllUsers(){

        try{
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        List<User> userList = new ArrayList<>();
        try{
        Connection connection = DriverManager.getConnection(url,userss,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
        while (resultSet.next()){
            User user = new User(resultSet.getInt("pid"),
                                resultSet.getString("name"),
                                resultSet.getString("surname"),
                                resultSet.getInt("age"));

            userList.add(user);
        }
        statement.close();
        connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return userList;

    }
}
