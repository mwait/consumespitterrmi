package com.wait.consume.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.wait.consume.SpitterRepository;


@Configuration
public class RmiConfig {


	@Bean
	public RmiProxyFactoryBean spitterRepository() {
	RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
	rmiProxy.setServiceUrl("rmi://localhost/SpitterRepository");
	rmiProxy.setServiceInterface(SpitterRepository.class);
	return rmiProxy;
	}
}
