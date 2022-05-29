package pl.coderslab.users;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@WebServlet("/userShow")
public class UserShow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();


        User user1 = new User();
        user1.setId(9);
        user1.setUserName("ania");
        user1.setEmail("ania.bania@gmail.com");
        user1.setPassword("koniczynka123");

        User user2 = new User();
        user2.setId(6);
        user2.setUserName("olek");
        user2.setEmail("ania.bahjhunia@gmail.com");
        user2.setPassword("koniczyjiijnka123");

        User user3 = new User();
        user3.setId(4);
        user3.setUserName("olekdd");
        user3.setEmail("dddia@gmail.com");
        user3.setPassword("ddd123");

        int idValue = Integer.parseInt(request.getParameter("id"));

        User[] all = {user1, user2, user3};
        List<User> users = new ArrayList<>();
        for (User u :
                all) {
            if (u.getId()==idValue){
                users.add(u);
            }
//            http://localhost:8080/userShow?id=6
        }

        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/addUser/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
