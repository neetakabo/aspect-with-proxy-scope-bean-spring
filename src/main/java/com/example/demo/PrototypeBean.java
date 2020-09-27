package com.example.demo;

public class PrototypeBean {

    public PrototypeBean(SomeDTO dtoArg1, OtherDTO dtoArg2) {
    }

    public int doSomething(){
        System.out.println("Doing something here!!");
        return this.hashCode();
    }
}
