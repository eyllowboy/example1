package servlets;

import DAO.UserDAO;
import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/delete")
public class ServletDelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

            int id = Integer.parseInt(req.getParameter("userId"));
            UserDAO userDAO = new UserDAO();

            userDAO.deleteUser(id);
            List<User> users = null;
            users = userDAO.getAllUsers();
            req.setAttribute("users", users);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/allUsers.jsp");

            requestDispatcher.forward(req, resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
