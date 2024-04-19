package com.ohgiraffers.crud.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

@Configuration
@ComponentScan(basePackages = "com.ohgiraffers.crud")
public class ContextConfiguration {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {

        ReloadableResourceBundleMessageSource Source = new ReloadableResourceBundleMessageSource();
        Source.setBasename("classpath:/messages/message");
        Source.setDefaultEncoding("UTF-8");
        Locale.setDefault(Locale.KOREA);
        return Source;

    }

}
