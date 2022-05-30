package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user/update")
public class UserUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("Nazwa");
        String email = request.getParameter("Email");
        String password = request.getParameter("Hasło");
        int id = Integer.parseInt(request.getParameter("id"));

        UserDao userDao = new UserDao();
        User user = new User();
        user.setId(id);
        user.setUserName(name);
        user.setEmail(email);
        user.setPassword(password);
        try {
            userDao.update(user);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        response.sendRedirect("http://localhost:8080/user/list");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
