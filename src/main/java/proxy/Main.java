package proxy;

public class Main {
    public static void main(String[] args) {
        Repository repository = new ProxyObject();
        repository.insertDataToDatabase("Blah blah blah ...");
    }
}
