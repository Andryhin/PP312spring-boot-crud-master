package com.example.pp_3_1_2_springbootcrud.service;

import com.example.pp_3_1_2_springbootcrud.dao.UserDao;
import com.example.pp_3_1_2_springbootcrud.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Controller
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void deleteUserById(long id) {
        userDao.deleteUserById(id);
    }

    @Override
    @Transactional
    public void updateUserById(long id, User user) {
        userDao.updateUserById(id, user);
    }

    @Override
    @Transactional
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public List<User> getListOfUsers() {
        return userDao.getListOfUsers();
    }
}
