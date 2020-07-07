package com.rohit.automation.winautomation.api;

import com.rohit.automation.winautomation.enums.NotificationType;

public final class CallmebotApi {
    private static final String WHATSAPP_API = "https://api.callmebot.com/whatsapp.php";
    private static final String WHATSAPP_API_KEY = "<API KEY HERE>>";
    private static final String TELEGRAM_API = "http://api.callmebot.com/start.php?user=@<YOUR TELEGRAM USER>";

    private CallmebotApi() {
    }

    public static String build(NotificationType type) {
        StringBuilder builder = new StringBuilder();

        if (NotificationType.WHATSAPP == type) {
            builder.append(WHATSAPP_API)
                    .append("?phone=<YOUR PHONE NO.>>&text=%s&apikey=")
                    .append(WHATSAPP_API_KEY);
        } else {
            builder.append(TELEGRAM_API)
                    .append("&text=%s&lang=en-IN-Standard-D&rpt=1");
        }
        return builder.toString();
    }
}
