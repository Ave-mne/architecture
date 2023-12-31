package HomeWork9.controller;

import HomeWork9.exceptions.UserNotFountException;
import HomeWork9.model.User;

import java.util.List;

public interface IUserController {
    User addUser(String userName);
    User deleteUser(int userId) throws UserNotFountException;
    List<User> getUsers();
    void addAll(List<User> listUsers);
}