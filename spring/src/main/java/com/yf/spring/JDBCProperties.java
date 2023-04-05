package com.yf.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class JDBCProperties {

    @Value("${url}")
    String url;//url
    @Value("${driverClassName}")
    String driverClassName;
    @Value("${user_name}")
    String username;
    @Value("${password}")
    String password;

    @Override
    public String toString() {
        return "JDBCProperties{" +
                "url='" + url + '\'' +
                ", driverClassName='" + driverClassName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
