package com.umpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author umpay
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CouponAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(CouponAdminApplication.class, args);
    }
}
