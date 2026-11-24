package com.shine.notification;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        // Create the Spring container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Spring container started!");

        System.out.println("Beans found: " +
                java.util.Arrays.toString(context.getBeanDefinitionNames()));

        // Get NotificationService from Spring
        NotificationService notificationService =
                context.getBean(NotificationService.class);

        System.out.println("Testing Spring Dependencies Injection...");
        //Send a notification
        notificationService.sendNotification("Welcome to Spring Dependency Injection!");

        // Close the Spring container
        context.close();
    }
}
