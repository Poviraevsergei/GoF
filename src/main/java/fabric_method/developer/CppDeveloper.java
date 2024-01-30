package fabric_method.developer;

public class CppDeveloper implements Developer {
    @Override
    public String commonStack() {
        return "C++, SQL, etc.";
    }

    @Override
    public String getLanguage() {
        return "C++";
    }

    @Override
    public int getSalary() {
        return 2500;
    }
}
