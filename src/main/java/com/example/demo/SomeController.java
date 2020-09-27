package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @Autowired
    ApplicationContext applicationContext;

    @GetMapping("/hello")
    public String hello(){
        SomeDTO someDTO = new SomeDTO();
        OtherDTO otherDTO = new OtherDTO();
        PrototypeBean prototypeBean = applicationContext.getBean(PrototypeBean.class, someDTO, otherDTO);

        return "hello from "+ prototypeBean.doSomething();
    }
}
