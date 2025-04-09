package com.ssafy;




import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ssafy.config.Config;
import com.ssafy.dto.Member;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx =   new AnnotationConfigApplicationContext(Config.class);
		
		Member m = ctx.getBean(Member.class);
		
		System.out.println(m.toString());
		System.out.println(m.getFriend());
	}

}
