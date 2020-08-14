package com.qfjy.service;

import com.qfjy.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 查询所有的用户信息
     * @return
     */
    @Select("select * from user")
    List<User> selectAll();
}
