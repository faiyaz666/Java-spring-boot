package com.example.demogradleproject;

import com.example.demogradleproject.config.BeanConfig;
import com.example.demogradleproject.model.Computer;
import com.example.demogradleproject.model.Programmer;
import com.example.demogradleproject.model.Supplier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BeanConfig.class })
public class DemoGradleProjectApplication {

    public static void main(String[] args) {
         ApplicationContext context = SpringApplication.run(DemoGradleProjectApplication.class, args);

       /*Manual Dependency

        Computer computer = new Computer();
        computer.setBrand("Hp");
        computer.setModel("2345");

        Supplier supplier = new Supplier("AB Computers", "Bangladesh");

        computer.setSupplier(supplier);

        Programmer programmer = new Programmer("Rafid", computer);
        programmer.printDetails();
        */

        Programmer programmer = context.getBean(Programmer.class);
        programmer.printDetails();


    }

}
