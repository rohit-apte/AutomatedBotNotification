package com.rohit.automation.winautomation.factory;

import com.rohit.automation.winautomation.api.CallmebotApi;
import com.rohit.automation.winautomation.enums.NotificationType;

public class Telegram extends Notification {
    @Override
    protected void createNotification() {
        String api = CallmebotApi.build(NotificationType.TELEGRAM);
        this.setCreatedNotification(api);
    }
}
