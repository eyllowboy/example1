package servlets;

import DAO.UserDAO;
import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/update")
public class ServletUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("userId"));
        UserDAO userDAO = new UserDAO();
        User user  = userDAO.selectUser(id);

        req.setAttribute("user", user);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/editUser.jsp");

        requestDispatcher.forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
