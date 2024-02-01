package proxy;

import java.time.LocalTime;

public class ProxyObject implements Repository {
    RepositoryImpl repository = new RepositoryImpl();

    @Override
    public void insertDataToDatabase(String data) {
        LocalTime start = LocalTime.now();
        repository.insertDataToDatabase(data);
        System.out.println("Время работы: " + (LocalTime.now().toNanoOfDay() - start.toNanoOfDay()));
    }
}
