package decorator;

public class JavaDeveloper implements Developer {
    @Override
    public void developCode() {
        System.out.println("Я пишу крутой код!");
    }
}
