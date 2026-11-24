package com.shine.notification;

/**
 * Defines the contract for sending messages.
 */
public interface MessageService {
    // Sends a message using the selected messaging service.
    void sendMessage(String message);
}
