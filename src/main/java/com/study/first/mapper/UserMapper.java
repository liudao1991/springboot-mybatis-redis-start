package com.study.first.mapper;
import com.study.first.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Component

@Repository
@Mapper
public interface UserMapper {
    int insertUser(User user);
    int deleteUser(Integer id);
    User selectUser(Integer id);
    int updateUser(User user);
    List<User> selectAll();
}
