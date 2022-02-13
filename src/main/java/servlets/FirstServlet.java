package servlets;

import DAO.UserDAO;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "FirstSerlet", value = "/FirstSerlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("!!!!!!!!");
        List<User> users = null;

        users = UserDAO.getAllUsers();


        req.setAttribute("users",users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/allUsers.jsp");
        requestDispatcher.forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            User user = new User();
            String name = req.getParameter("name");
            String surname = req.getParameter("surname");
            int age = Integer.parseInt(req.getParameter("age"));

            user.setPid(11);
            user.setName(name);
            user.setSurname(surname);
            user.setAge(25);
            UserDAO.addUsers(user);
            System.out.println("@@@@@@");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        List<User> users = null;

        users = UserDAO.getAllUsers();


        req.setAttribute("users",users);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/allUsers.jsp");
        requestDispatcher.forward(req, resp);
    }
}
