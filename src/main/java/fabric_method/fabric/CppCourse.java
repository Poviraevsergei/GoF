package fabric_method.fabric;

import fabric_method.developer.CppDeveloper;
import fabric_method.developer.Developer;

public class CppCourse implements Course {
    @Override
    public Developer getDeveloper() {
        return new CppDeveloper();
    }
}
