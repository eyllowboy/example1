package servlets;

import DAO.UserDAO;
import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ServletPostUpdate")
public class ServletPostUpdate extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("%%%%4545454%%%%%%%");
//        int id = Integer.parseInt(req.getParameter("id"));
//        String name = req.getParameter("name");
//        String surname = req.getParameter("surname");
//        int age = Integer.parseInt(req.getParameter("age"));
//
//        System.out.println("@@@@@@@@@");
//        System.out.println(id);
//        System.out.println("1@@@@@@@@@");
//        System.out.println(name);
//        System.out.println("2@@@@@@@@@");
//        System.out.println(surname);
//        System.out.println("3@@@@@@@@@");
//        System.out.println(age);
//        System.out.println("@@@@@@@@@");
//        User user = new User();
//        user.setPid(id);
//        user.setName(name);
//        user.setSurname(surname);
//        user.setAge(age);
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(surname);
//        System.out.println(age);
//        UserDAO userDAO = new UserDAO();
//
//        try {
//            userDAO.updateUser(user);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        List<User> users=null;
//        users =userDAO.getAllUsers();
//        req.setAttribute("users", users);
//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/allUsers.jsp");
//
//        requestDispatcher.forward(req, resp);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        int age = Integer.parseInt(req.getParameter("age"));
        User user = new User();
       user.setPid(id);
        user.setName(name);
        user.setSurname(surname);
        user.setAge(age);

        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        UserDAO userDAO = new UserDAO();
        try {
            userDAO.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<User> users=null;
        users =userDAO.getAllUsers();
        req.setAttribute("users", users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/allUsers.jsp");

        requestDispatcher.forward(req, resp);
    }
}
