package com.rest.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	public SpringSecurityConfig() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication().withUser("kiran").password("kiran").roles("USER").and().withUser("demo")
		.password("demo").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
			.httpBasic().and().authorizeRequests()
				.antMatchers("/**").hasRole("USER").and()
				.csrf().disable().headers()
				.frameOptions().disable();
	}
	

}
