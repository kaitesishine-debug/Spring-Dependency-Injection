package com.shine.notification;

import org.springframework.stereotype.Component;
/*
* Provides email messaging functionality.
 */
@Component
public class EmailService implements MessageService {

    // Displays the email message being sent.
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
    }
}
