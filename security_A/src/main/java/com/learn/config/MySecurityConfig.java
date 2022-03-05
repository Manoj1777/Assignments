package com.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.web.servlet.FormLoginDsl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http
		//.csrf().disable() // we use this when client is not using browser... so client is using postman
		.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		.and()
		  .authorizeRequests()
		  .antMatchers("/singin").permitAll()
		  .antMatchers("/public/**").hasRole("NORMAL")
		  .antMatchers("/user/**").hasRole("ADMIN")
		  .anyRequest()
		  .authenticated()
		  .and()
		 // .httpBasic();// this only for basic security
		.formLogin()  // this is for form base security
		.loginPage("/singin")
		.defaultSuccessUrl("/users/");
		
	}
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception
	{
	
		auth.inMemoryAuthentication().withUser("manoj").password(this.passwordEncoder().encode("manoj")).roles("NORMAL");
		auth.inMemoryAuthentication().withUser("suraj").password(this.passwordEncoder().encode("suraj")).roles("ADMIN");
		
	 }
       @Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder(10);
	}


}
