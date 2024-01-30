package singleton;

//Singleton - позволяет создавать только один обьект
public class Fox {
    private static Fox fox;
    public int age;
    private Fox(int age) {
        this.age = age;
    }

    public static Fox init(int age){
        if (fox == null){
            fox = new Fox(age);
        }
        return fox;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "age=" + age +
                '}';
    }
}
