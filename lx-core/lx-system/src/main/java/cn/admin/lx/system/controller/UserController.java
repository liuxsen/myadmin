package cn.admin.lx.system.controller;

import cn.admin.lx.system.domain.po.User;
import cn.admin.lx.system.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuxsen 2023/12/22
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    UserMapper userMapper;

    @GetMapping("")
    List<User> hello(){
        return userMapper.selectList(null);
    }
}
