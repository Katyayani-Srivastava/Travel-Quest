package com.travel.dao;

import com.travel.model.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {
    private final UserDAO userDAO = new UserDAO();

    @Test
    void testSaveUser() {
        User user = new User(0, "Test User", "testuser@example.com");
        userDAO.saveUser(user);

        List<User> users = userDAO.getAllUsers();
        boolean userExists = users.stream()
                                  .anyMatch(u -> u.getName().equals("Test User") && u.getEmail().equals("testuser@example.com"));

        assertTrue(userExists, "User should be saved successfully in the database.");
    }

    @Test
    void testGetAllUsers() {
        List<User> users = userDAO.getAllUsers();
        assertNotNull(users, "List of users should not be null.");
    }
}
