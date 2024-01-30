package fabric_method.developer;

public class PythonDeveloper implements Developer {
    @Override
    public String commonStack() {
        return "Python, Django etc.";
    }

    @Override
    public String getLanguage() {
        return "Python";
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}
