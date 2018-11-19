package com.nc.springBootTest.util;

import java.util.Locale;



import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

public class SpringmvcConfig {
	
	//配置国际化语言解析器
	@Bean
	public LocaleResolver localeResolver(){
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(Locale.CHINESE);
		return sessionLocaleResolver;
	}
	
	//添加切换语言拦截器
	public LocaleChangeInterceptor localeChangeInterceptor(){
		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
		//请求的参数
		localeChangeInterceptor.setParamName("locale");
		return localeChangeInterceptor;
	}
	
	//添加拦截器
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
		
	}
}
