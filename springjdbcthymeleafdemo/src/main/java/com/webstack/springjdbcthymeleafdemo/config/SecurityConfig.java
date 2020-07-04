package com.webstack.springjdbcthymeleafdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("keyur").password("{noop}denish")
        .authorities("ROLE_USER").and().withUser("admin").password("{noop}admin")
        .authorities("ROLE_USER", "ROLE_ADMIN");
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/index")
        .hasAnyRole("USER", "ADMIN").antMatchers("/sales").hasAnyRole("USER", "ADMIN")
        .antMatchers("/new").hasAnyRole("ADMIN").anyRequest().authenticated().and().formLogin()
        .permitAll().and().logout().permitAll();

		http.csrf().disable();
	}
		
}
