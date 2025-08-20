package pl.coderslab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //Introduction
        System.out.println("Done by Arek");
        SayGoodbye test = context.getBean(SayGoodbye.class);
        test.hello();

        HelloWorld bean = context.getBean("helloWorld", HelloWorld.class);
        bean.hello();

        //Zadanie 2
        System.out.println("-------------");

        Ship ship = context.getBean("blackPearl", Ship.class);
        ship.getCaptain().startSailing();

        //Zadanie 3
        System.out.println("---------------");
        ScopeSingleton singleton1 = context.getBean(ScopeSingleton.class);
        System.out.println(singleton1);
        ScopeSingleton singleton2 = context.getBean(ScopeSingleton.class);
        System.out.println(singleton2);
        System.out.println((singleton1 == singleton2) + ": ten sam obiekt\n");
        ScopePrototype prototype1 = context.getBean(ScopePrototype.class);
        System.out.println(prototype1);
        ScopePrototype prototype2 = context.getBean(ScopePrototype.class);
        System.out.println(prototype2);
        System.out.println((prototype1 == prototype2) + ": dwa różne obiekty");

    }
}
