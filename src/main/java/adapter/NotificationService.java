package adapter;

public class NotificationService {
    public boolean sendMessageToEmail(String message){
        try {
            System.out.println("Отправляю сообщение на email: " + message);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void printAllMessages(){
        System.out.println("...");
    }
}
