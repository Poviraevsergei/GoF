package adapter;

public class Main {
    public static void main(String[] args) {
        ISender sender = new Adapter();
        sender.send("\n Your login: groupC71 \n password: qwerty!");
        sender.send("\n Your login: groupC71 \n password: qwerty!");
        sender.send("\n Your login: groupC71 \n password: qwerty!");
        sender.send("\n Your login: groupC71 \n password: qwerty!");
        sender.send("\n Your login: groupC71 \n password: qwerty!");
        sender.send("\n Your login: groupC71 \n password: qwerty!");
    }
}
