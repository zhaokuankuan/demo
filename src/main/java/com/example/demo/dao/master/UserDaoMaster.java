package com.example.demo.dao.master;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户表
 * Created  by Mr.kk
 * DateTime on 2019-09-20 11:19:11
 */
public interface UserDaoMaster {


    /**
     * 全部查询
     */
    public List<User> getAll(@Param("user")User user);

}

