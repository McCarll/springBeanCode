package ru.mccarl.springBeanCode;

/**
 * Created by vrudometkin on 24/11/2017.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {
        "ru.mccarl.springBeanCode.configuration",
        "ru.mccarl.springBeanCode.entity",
        "ru.mccarl.springBeanCode.web"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
