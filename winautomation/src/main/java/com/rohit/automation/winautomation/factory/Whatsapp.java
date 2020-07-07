package com.rohit.automation.winautomation.factory;

import com.rohit.automation.winautomation.api.CallmebotApi;
import com.rohit.automation.winautomation.enums.NotificationType;

public class Whatsapp extends Notification {

    @Override
    protected void createNotification() {
        String api = CallmebotApi.build(NotificationType.WHATSAPP);
        this.setCreatedNotification(api);
    }
}
