package com.li;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@EnableEurekaClient   //联合eureka ,获取服务信息，方便分配 
@EnableZuulProxy  //添加zuul支持
public class SpringCloud_Zuul {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloud_Zuul.class, args);
	}
}
