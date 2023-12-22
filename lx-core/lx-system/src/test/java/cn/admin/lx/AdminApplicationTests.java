package cn.admin.lx;

import cn.admin.lx.system.domain.po.User;
import cn.admin.lx.system.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author liuxsen 2023/12/22
 */
@SpringBootTest()
public class AdminApplicationTests {
    @Resource
    UserMapper userMapper;

    @Test
    void testMapper(){
        List<User> users = this.userMapper.selectList(null);
        System.out.println(users);
    }
}
