package com.rohit.automation.winautomation.service;

import com.rohit.automation.winautomation.enums.NotificationType;
import com.rohit.automation.winautomation.factory.Notification;
import com.rohit.automation.winautomation.factory.NotificationFactory;

import java.io.IOException;
import java.nio.file.*;
import java.time.Instant;

public class AutomationExecutor {
    public static void main(String[] args) throws InterruptedException {
        /** started laptop sending automated whatsapp and telegram message **/
        Notification notification = NotificationFactory.getNotificationFactory(NotificationType.WHATSAPP);
        notification.sendMessage("Hi Rohit \n Your laptop has been started \n Date : " + Instant.now());
        notification = NotificationFactory.getNotificationFactory(NotificationType.TELEGRAM);
        notification.sendMessage("Hi Rohit ,\n Just now your laptop has been started and its online now.... start date is " + Instant.now());

        /*Path path = Paths.get("D:\\Rohit\\WorkSpace\\Automation");
        WatchService watchService = null;
        try {
            watchService = path.getFileSystem().newWatchService();
            path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
        } catch (IOException e) {
//            e.printStackTrace();
        }

        WatchKey watchKey;
//        System.out.println("watcher started...");
        while (null != (watchKey = watchService.take())) {
            watchKey.pollEvents().stream().forEach(watchEvent -> {
                System.out.println(watchEvent.kind());
                System.out.println(watchEvent.context());
                FIleService.readAndModify(path.toAbsolutePath().toString().concat("\\").concat(watchEvent.context().toString()));
            });
            watchKey.reset();
        }*/
    }
}
