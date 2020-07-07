package com.rohit.automation.winautomation.factory;

import com.rohit.automation.winautomation.enums.NotificationType;

public class NotificationFactory {
    public static Notification getNotificationFactory(NotificationType type) {
        switch (type) {
            case TELEGRAM:
                return new Telegram();
            case WHATSAPP:
                return new Whatsapp();
            default:
                return null;
        }
    }
}
