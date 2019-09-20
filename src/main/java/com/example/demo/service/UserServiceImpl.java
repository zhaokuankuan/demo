package com.example.demo.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.dao.master.UserDaoMaster;
import com.example.demo.dao.slave.UserDaoSlave;
import com.example.demo.domain.User;
import com.example.demo.service.inter.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户表
 * Created  by Mr.kk
 * DateTime on 2019-09-20 11:19:11
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDaoMaster userDao;

    @Resource
    private UserDaoSlave userDao1;


    /**
     * 全部查询
     */
    public Object getAll(User user){
        Map<String,Object> map = new HashMap<String,Object>();
        List<User> list = userDao.getAll(user);
        List<User> list1 = userDao1.getAll(user);
        log.info("mster is :{}", JSON.toJSONString(list));
        log.info("slave is :{}", JSON.toJSONString(list1));
        map.put("master",list);
        map.put("slave",list1);
        return map;
    }


}

