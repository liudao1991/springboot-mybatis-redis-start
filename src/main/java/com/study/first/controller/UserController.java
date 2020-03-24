package com.study.first.controller;
import com.study.first.model.User;
import com.study.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping(value = "/findall")
    public List<User> findAll() {
        return userService.selectAll();
    }

    @Resource(name = "UserServiceNewImpl")
    private UserService userServiceNew;

     @RequestMapping(value = "/selectall", method = RequestMethod.GET)
     public @ResponseBody Object onAll() {
         List list = userServiceNew.selectAll();
         return list;
    }
}
