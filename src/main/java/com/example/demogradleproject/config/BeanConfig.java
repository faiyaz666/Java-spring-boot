package com.example.demogradleproject.config;

import com.example.demogradleproject.model.Computer;
import com.example.demogradleproject.model.Programmer;
import com.example.demogradleproject.model.Supplier;
import org.springframework.context.annotation.Bean;

public class BeanConfig {

    @Bean
    public Programmer programmer(Computer computer) {
        Programmer programmer = new Programmer();
        programmer.setName("Mr. A");
        programmer.setComputer(computer);
        return programmer;
    }

    @Bean
    public Computer computer(Supplier supplier) {
        Computer computer = new Computer();
        computer.setBrand("Dell");
        computer.setModel("xyz-123");
        computer.setSupplier(supplier);
        return computer;
    }

    @Bean
    public Supplier supplier() {
        Supplier supplier = new Supplier();
        supplier.setName("China Computers");
        supplier.setCountry("China");
        return supplier;
    }
}