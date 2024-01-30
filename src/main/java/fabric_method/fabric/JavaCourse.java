package fabric_method.fabric;

import fabric_method.developer.Developer;
import fabric_method.developer.JavaDeveloper;

public class JavaCourse implements Course {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
