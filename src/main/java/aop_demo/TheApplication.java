package aop_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"aop_demo"})
public class TheApplication {

    @Bean(name="MyAspect")
    public MyAspect initMyAspect() {
        return new MyAspect();
    }
    public static void main(String[] args) {
        SpringApplication.run(TheApplication.class, args);
    }
}
