package net.idt.learning.foo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "net.idt.learning.foo")
public class Configurer {

//    @Bean
//    Employee employee() {
//        return new Employee("Filya", 400);
//    }

//    @Bean Address address() {
//        return new Address("Zhodino", "Ivanova str.", "99");
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurer.class);
        System.out.println(context.getBean(Employee.class).toString());
    }
}
