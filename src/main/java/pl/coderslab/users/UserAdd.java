package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/user/add")
public class UserAdd extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
getServletContext().getRequestDispatcher("/users/add.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String name = request.getParameter("Nazwa");
String email = request.getParameter("Email");
String password = request.getParameter("Hasło");

        UserDao userDao = new UserDao();
        User user = new User();
        user.setUserName(name);
        user.setEmail(email);
        user.setPassword(password);
        userDao.create(user);

        response.sendRedirect("http://localhost:8080/user/list");
    }
}
