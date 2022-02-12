package servlets;

import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletAddUser", value = "/ServletAddUser")
public class ServletAddUser extends HttpServlet {

    DatabaseConnection connection = new DatabaseConnection();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        //String age = req.getParameter("age");

        User user = new User();
        user.setPid(11);
        user.setName(name);
        user.setSurname(surname);
        user.setAge(11);

        connection.addUser(user);
    }
}
