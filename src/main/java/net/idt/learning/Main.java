package net.idt.learning;

import net.idt.learning.quoter.Quoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //DynamicProxy - идёт через интерфейсы Proxy.newProxyInstance
        //Cglib - идёт, наследуясь от класса
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        while (true) {
//            Thread.sleep(1000);
            context.getBean(Quoter.class).sayQuote(); //because with class it can be Proxy
//        }
    }
}
