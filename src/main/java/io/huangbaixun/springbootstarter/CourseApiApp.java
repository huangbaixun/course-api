package io.huangbaixun.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.huangbaixun.springbootstarter.Topic.TopicRepository;

@SpringBootApplication
public class CourseApiApp {
	
	public static void main(String[] args){
		SpringApplication.run(CourseApiApp.class, args);
	}
}
