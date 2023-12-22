package cn.admin.lx.system.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author liuxsen 2023/12/22
 */
@Data
@TableName("user")
public class User {
    @TableId
    private Long id;
    private String name;
}
