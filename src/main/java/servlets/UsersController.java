package servlets;

import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users")
public class UsersController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("!!!!!!");
//        DatabaseConnection db = new DatabaseConnection();
//        User user = new User(3,"Ivan","Ivanov",25);
//
//        db.addUser(user);
        System.out.println("!!!!!!");
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("WEB-INF/allUser.jsp");
        requestDispatcher.forward(req,resp);
    }
}
