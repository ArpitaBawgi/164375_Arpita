package com.spring8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Configurations {
	 @Bean
	    @Scope(value="singleton")
	    public MyBean MyBean() {
		return new MyBean();
	    }
}
