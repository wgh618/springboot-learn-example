package com.will.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:MessageConfiguration
 * Description:
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-09-04
 */
@Configuration
public class MessageConfiguration {
    @Bean
    public String message() {
        return "message configuration";
    }
}
