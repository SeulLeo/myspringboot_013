package com.example.mapper;

import com.example.entity.User;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @Author:zk
 * @Date: 2020/4/20 0026
 * @Time: 14:42
 */
@Repository
public interface UserMapper {

    User Sel(int id);

	List<User> SelAll();

	int insert(User user);

	int deleteById(User user);

	int updateById(User user);
}
