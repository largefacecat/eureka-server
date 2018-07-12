package com.sail.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/** 
* @author : zf
* @create_time : 2018年7月12日 下午5:21:54 
* @description :
*/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	public static void main (String [] args){
		SpringApplication.run(EurekaServerApplication.class,args);
	}
}
