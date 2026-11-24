package com.shine.notification;

import org.springframework.stereotype.Component;
/*
* Provides email messaging functionality.
 */
@Component
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
