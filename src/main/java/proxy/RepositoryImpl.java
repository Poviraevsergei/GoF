package proxy;

public class RepositoryImpl implements Repository {
    @Override
    public void insertDataToDatabase(String data) {
        System.out.println("Подключается в базе");
        System.out.println("Сохраняет данные: " + data);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
