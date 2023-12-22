package cn.admin.lx.common.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;

/**
 * @author liuxsen 2023/12/22
 */
@AutoConfiguration
@MapperScan("cn.admin.lx.**.mapper")
public class MybatisPlusConfig {
}
