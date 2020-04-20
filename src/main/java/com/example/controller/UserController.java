package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zk
 * @Date: 2020/4/20 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
    	return userService.Sel(id).toString();
    }
    
    @RequestMapping("findAll")
    public String findAll(){
    	return userService.SelAll().toString();
    }
    
    @RequestMapping("insert/id={id}&username={username}&password={password}")
    public String insert(User user){
        userService.insert(user);
        return "success";
    }
    
    @RequestMapping("delete/id={id}")
    public String delete(User user){
        userService.delete(user);
        return "success";
    }
    
    @RequestMapping("update/id={id}&username={username}&password={password}")
    public String update(User user){
        userService.update(user);
        return "success";
    }
}
