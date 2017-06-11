package com.speed.mixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.speed.mixer.filter.SimpleFilter;

@EnableDiscoveryClient
@EnableZuulProxy
@SpringBootApplication
public class SpringbootM6ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootM6ZuulApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
