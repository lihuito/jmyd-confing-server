package com.cn.config.server;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class JmydConfigServerAplication {

	public static void main(String[] args) {

		SpringApplication.run(JmydConfigServerAplication.class, args);
	}

}
