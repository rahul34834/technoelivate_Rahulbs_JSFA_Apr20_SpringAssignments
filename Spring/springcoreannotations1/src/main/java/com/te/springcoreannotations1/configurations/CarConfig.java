package com.te.springcoreannotations1.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({EngineConfig.class,WheelsConfig.class})
@ComponentScan("com.te.springcoreannotations1")

public class CarConfig {
	
}
