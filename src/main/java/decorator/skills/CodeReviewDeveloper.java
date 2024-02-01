package decorator.skills;

import decorator.Decorator;
import decorator.Developer;

import java.util.Date;

public class CodeReviewDeveloper extends Decorator {
    public CodeReviewDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public void developCode() {
        super.developCode();
        System.out.println("Я умею делать code review!");
    }
}
