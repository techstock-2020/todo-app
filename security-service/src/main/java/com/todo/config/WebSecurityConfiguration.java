package com.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests(a -> a
									.antMatchers("/", "/error", "/webjars/**")
									.permitAll()
									.anyRequest()
									.authenticated()
							  )
			.exceptionHandling(e -> e  //to configure endpoints to respond with a 401 instead of the default behavior of redirecting to a login page.
									.authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
							  )
			.csrf(c -> c   //csrf later check based on the Fronend Ui technology
					.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
				 )
			.logout(l -> l
					.logoutSuccessUrl("/").permitAll()
				    )
			.oauth2Login();
	}
}
