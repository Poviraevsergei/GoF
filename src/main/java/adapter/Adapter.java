package adapter;

public class Adapter implements ISender {
    NotificationService notificationService = new NotificationService();
    @Override
    public boolean send(String message) {
        return notificationService.sendMessageToEmail(message);
    }
}

/*
1 example:
public class Adapter extends NotificationService implements ISender {
    @Override
    public boolean send(String message) {
        return sendMessageToEmail(message);
    }
}
 */
