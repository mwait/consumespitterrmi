package com.wait.consume;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wait.consume.config.RmiConfig;

import spittr.Spitter;

public class RmiTest {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				RmiConfig.class);
		SpitterRepository spitterRepository = (SpitterRepository) context.getBean("spitterRepository");
		Spitter spitter = spitterRepository.findByUsername("marysia");
		System.out.println(spitter.getId()+" "+spitter.getFirstName()+" "+spitter.getEmail());
	}
}
