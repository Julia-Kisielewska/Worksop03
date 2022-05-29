package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/user/list")
public class UserList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        UserDao newDao = new UserDao();
//        List<User> users = new ArrayList<>();
//
//        try {
//            users = Arrays.asList(newDao.findAll());
//            request.setAttribute("users", "user");
//            getServletContext().getRequestDispatcher("/usersList.jsp").forward(request, response);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

//gółwny jsp====================================


        getServletContext().getRequestDispatcher("/users/list.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        String name = request.getParameter("Nazwa");
//        String email = request.getParameter("Email");
//        String password = request.getParameter("Hasło");
    }
}
