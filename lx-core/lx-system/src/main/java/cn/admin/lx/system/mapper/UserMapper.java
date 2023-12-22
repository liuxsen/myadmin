package cn.admin.lx.system.mapper;

import cn.admin.lx.system.domain.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liuxsen 2023/12/22
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
