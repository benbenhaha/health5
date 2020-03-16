package com.benben.health.controller;



import com.benben.health.bean.Result;
import com.benben.health.bean.User;
import com.benben.health.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController    //相当于@Controller+@RequestBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    @GetMapping(value = "/regist")
    public Result regist(User user){
        return userService.regist(user);
    }
    /**
     * 登录
     * @param user 参数封装
     * @return Result
     */
    @GetMapping(value = "/login")
    public Result login(User user){
        return userService.login(user);
    }
}

