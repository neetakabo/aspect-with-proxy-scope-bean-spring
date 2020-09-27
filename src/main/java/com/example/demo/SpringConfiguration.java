package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfiguration {


    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean(SomeDTO dtoArg1, OtherDTO dtoArg2) {
        return new PrototypeBean(dtoArg1, dtoArg2);
    }

    @Bean
    public TestAspect testAspect() {
        return new TestAspect();
    }
}
