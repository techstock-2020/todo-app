//package com.todo.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.Filter;
//import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.oauth2.client.OAuth2ClientContext;
//import org.springframework.security.oauth2.client.OAuth2RestTemplate;
//import org.springframework.security.oauth2.client.filter.OAuth2ClientAuthenticationProcessingFilter;
//import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
//
//@EnableOAuth2Client
//public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private OAuth2ClientContext oauth2ClientContext;
//
//	@Bean
//	@ConfigurationProperties("security.oauth2.google.client")
//	public AuthorizationCodeResourceDetails google() {
//		return new AuthorizationCodeResourceDetails();
//	}
//
//	@Bean
//	@ConfigurationProperties("security.oauth2.google.resource")
//	public OAuth2ResourceServerProperties googleResource() {
//		return new OAuth2ResourceServerProperties();
//	}
//
//	private Filter ssoGoogleFilter() {
//		OAuth2ClientAuthenticationProcessingFilter googleFilter = new OAuth2ClientAuthenticationProcessingFilter(
//				"/login/google");
//		OAuth2RestTemplate googleTemplate = new OAuth2RestTemplate(google(), oauth2ClientContext);
//		
//		googleFilter.setRestTemplate(googleTemplate);
//		googleFilter.setTokenServices(new UserInfoTokenServices(googleResource().getUserInfoUri(), google().getClientId()));
//		return googleFilter;
//	}
//}
