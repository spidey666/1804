package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer //启动EurekaServer
public class EurekaServer {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}
}
