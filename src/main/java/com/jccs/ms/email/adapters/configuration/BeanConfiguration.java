package com.jccs.ms.email.adapters.configuration;

import com.jccs.ms.email.EmailApplication;
import com.jccs.ms.email.application.ports.EmailRepositoryPort;
import com.jccs.ms.email.application.ports.SendEmailServicePort;
import com.jccs.ms.email.application.services.EmailServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = EmailApplication.class)
public class BeanConfiguration {

	@Bean
	EmailServiceImpl emailServiceImpl(EmailRepositoryPort repository, SendEmailServicePort sendEmailServicePort) {
		return new EmailServiceImpl(repository, sendEmailServicePort);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
