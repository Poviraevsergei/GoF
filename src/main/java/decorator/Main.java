package decorator;

import decorator.skills.CodeReviewDeveloper;
import decorator.skills.FrontDeveloper;

public class Main {
    public static void main(String[] args) {
        JavaScriptDeveloper javaScriptDeveloper = new JavaScriptDeveloper();
        CodeReviewDeveloper codeReviewDeveloper = new CodeReviewDeveloper(javaScriptDeveloper);
        FrontDeveloper frontAndCanDoReviewDeveloper = new FrontDeveloper(codeReviewDeveloper);

        frontAndCanDoReviewDeveloper.developCode();
    }
}
