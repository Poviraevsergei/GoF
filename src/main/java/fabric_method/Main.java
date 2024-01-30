package fabric_method;

import fabric_method.fabric.Course;
import fabric_method.fabric.CppCourse;

public class Main {
    public static void main(String[] args) {
        Course course = new CppCourse();
        System.out.println(course.getDeveloper());
        course.courseInfo();
    }
}
