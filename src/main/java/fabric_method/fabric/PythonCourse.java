package fabric_method.fabric;

import fabric_method.developer.Developer;
import fabric_method.developer.PythonDeveloper;

public class PythonCourse implements Course {
    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }
}
