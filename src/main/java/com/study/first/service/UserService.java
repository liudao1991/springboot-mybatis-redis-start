package com.study.first.service;
import com.study.first.model.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int deleteUser(Integer id);
    User selectUser(Integer id);
    int updateUser(User user);
    List<User> selectAll();
}
