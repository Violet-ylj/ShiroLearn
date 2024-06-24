package com.bda.employee.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.bda.common.core.config.anno.BdaBootApplication;

/**
 * 启动 主入口 
 * 一般不需要动，直接 复制修改一名字即可
 * @author heshuyuan
 * 重要注解：
 * 
 * @EnableFeignClients(value={"com.bda"}) 主要是开启feign ,这里的feign 客户端，产品里面feign 包名是com.bda 开头的，建议项目开展时候，包名也是com.bda
 *   
 * @BdaBootApplication 自己封装的启动注解，应用启动必须有的注解，
 * -- @ComponentScan(value={"com.bda"},nameGenerator = BdaBeanNameGenerator.class)  声明容器扫描包名，并 定义 bean 的 命名规则
 * -- @EnableDiscoveryClient     开启注册中心                                                  
 * -- @EnableScheduling          @Scheduling  调度注解生效
 * -- @EnableTransactionManagement   开始事务处理
 * -- @SpringBootApplication   spring boot 原生启动注解
 * 
 */
@EnableFeignClients(value={"com.bda"})
@BdaBootApplication
public class EmployeeStarter 
{
    public static void main( String[] args )
    {
    	/**
    	 * 这个主要是激活 bootstrap.properties 配置
    	 * 这个文件里面的配置一般不用修改
    	 */
    	System.setProperty("spring.cloud.bootstrap.enabled", "true");
    	
        SpringApplication.run(EmployeeStarter.class, args);
    }
}
