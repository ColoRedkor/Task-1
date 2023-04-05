package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Nike", "Petrov", (byte) 5);
        userService.saveUser("Mihail", "Pypkin", (byte) 3);
        userService.saveUser("Serg", "Gorelov", (byte) 18);
        userService.saveUser("Saha", "Ivanova", (byte) 23);

        List<User> list = userService.getAllUsers();
        for (User user : list) {
            System.out.println(user.toString());
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();

        // userService.removeUserById(1);





    }
}
