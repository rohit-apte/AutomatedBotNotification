# AutomatedBotNotification
This application send automated notification using CallMeBotApi on WhatsApp and Telegram when laptop starts.
Get Notified whenever your Windows Machine starts. | Windows | Automation | Java

Create a .bat file with the command to start AutomationExecutor main class and place that bat file at "C:\Windows\System32".

Using NSSM create a Windows service using this bat file. Install the service with startup type as Automatic.

Every time whenever windows machine will start, it will start this service (created using NSSM). 

Cheers. Enjoy!
