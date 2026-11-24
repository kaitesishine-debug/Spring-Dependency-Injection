package com.shine.notification;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configures the Spring application and scans for components.
 */
@Configuration

// Automatically detects Spring components in the notification package.
@ComponentScan(basePackages = "com.shine.notification")
public class AppConfig {
}
