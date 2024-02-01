package adapter;

public class SmsSender implements ISender {
    @Override
    public boolean send(String message) {
        try {
            System.out.println("Отправляю SMS с сообщением: " + message);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
