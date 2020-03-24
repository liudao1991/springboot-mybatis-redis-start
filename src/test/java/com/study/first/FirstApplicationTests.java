package com.study.first;

import com.study.first.model.User;
import com.study.first.model.UserRedis;
import com.study.first.service.UserService;
import com.study.first.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class FirstApplicationTests {

    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService us;

    @Resource
    private RedisUtil redisUtil;

    @Test
    void contextLoads() {
    }



    @Test
    public void redisgetset(){
        UserRedis userRedis =new UserRedis();
        userRedis.setId(1);
        userRedis.setName("liudao");
        userRedis.setAge(2);
        redisUtil.set("test",userRedis);
        System.out.println(redisUtil.get("test"));
    }



    @Test
    public void findAll(){
        List<User> u_list = us.selectAll();
        System.out.println(u_list);
    }

    @Test
    public void  addUser(){
        User u = new User("liudao",5);
        System.out.println(us.addUser(u));
        System.out.println(u.getId());
    }

    @Test
    public void deleteUser(){
        Integer id = 2;
        us.deleteUser(id);
    }

    @Test
    public void selectUser(){
        Integer id = 1;
        User ur = us.selectUser(id);
        System.out.println(ur);
    }

    @Test
    public void updateUser(){
        User u = new User(1,"liudao1",25);
        us.updateUser(u);
    }


}
