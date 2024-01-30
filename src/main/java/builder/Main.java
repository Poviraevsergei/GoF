package builder;

public class Main {
    public static void main(String[] args) {
        House house_1 = new House.Builder().setColor("Red").setRoof("Excellent").build();
        System.out.println(house_1);

        House house_2 = new House.Builder().setDoor("Bad").build();
        System.out.println(house_2);
    }
}
