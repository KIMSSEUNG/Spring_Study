package com.ssafy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ssafy.dto.Friend;
import com.ssafy.dto.Member;

@Configuration
@ComponentScan(basePackages = "com.ssafy")
public class Config {
	@Bean
	public Member member() {
		return new Member("둘리", 10);
	}
	
	@Bean
	public Friend firend() {
		return new Friend("또치", 10);
	}
}
