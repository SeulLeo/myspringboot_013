package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:zk
 * @Date: 2020/4/20 0026
 * @Time: 14:42
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
	public List<User> SelAll() {
		// TODO Auto-generated method stub
		return userMapper.SelAll();
	}
	public int insert(User user) {
		// TODO Auto-generated method stub
		return userMapper.insert(user);
	}
	public int delete(User user) {
		// TODO Auto-generated method stub
		return userMapper.deleteById(user);
	}
	public int update(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateById(user);
	}
}
