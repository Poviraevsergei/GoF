package builder;

public class Main {
    public static void main(String[] args) {
        House house_1 = new House.HouseBuilder().color("Red").roof("Excellent").build();
        System.out.println(house_1);

        House house_2 = new House.HouseBuilder().door("Bad").build();
        System.out.println(house_2);
    }
}
