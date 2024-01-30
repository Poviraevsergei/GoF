package fabric_method.developer;

public class JavaDeveloper implements Developer {
    @Override
    public String commonStack() {
        return "Java, Spring, SQL, Hibernate etc.";
    }

    @Override
    public String getLanguage() {
        return "Java";
    }

    @Override
    public int getSalary() {
        return 3000;
    }
}
