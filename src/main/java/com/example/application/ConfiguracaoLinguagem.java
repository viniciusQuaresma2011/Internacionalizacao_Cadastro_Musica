package com.example.application;

import java.util.Locale;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;


@Configuration
@EnableAutoConfiguration
public class ConfiguracaoLinguagem implements WebMvcConfigurer {
	
	@Bean
	public LocaleResolver locale_resolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		localeResolver.setLocaleAttributeName("session.current.locale");
		return localeResolver;
	
	}
	
	@Bean
	public LocaleChangeInterceptor locale_change() {
		LocaleChangeInterceptor locale_change = new LocaleChangeInterceptor();
		locale_change.setParamName("lang");
		return locale_change;
	}
	

	public void addInterceptor(InterceptorRegistry registry) {
		registry.addInterceptor(locale_change());
	}
}
