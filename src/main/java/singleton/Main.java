package singleton;

public class Main {
    public static void main(String[] args) {
        Fox fox = Fox.init(10);
        System.out.println(fox);
        Fox fox1 = Fox.init(20);
        System.out.println(fox1);
    }
}
