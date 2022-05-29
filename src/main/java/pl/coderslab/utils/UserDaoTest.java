package pl.coderslab.utils;

import pl.coderslab.utils.User;
import pl.coderslab.utils.UserDao;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args)  {
        UserDao newDao = new UserDao();

        User[] all = new User[0];
        try {
            all = newDao.findAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (User u : all) {
            System.out.println(u.toString());
        }
    }
}
