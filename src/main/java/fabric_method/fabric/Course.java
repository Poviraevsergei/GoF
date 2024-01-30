package fabric_method.fabric;

import fabric_method.developer.Developer;

public interface Course {
    default void courseInfo() {
        Developer developer = getDeveloper();
        System.out.println("Добро пожаловать на наш курс!");
        System.out.println("На нем вы изучите " + developer.getLanguage() + " язык!");
        System.out.println("Вы узнаете следующие технологии: " + developer.commonStack());
        System.out.println("Средняя зарплата по рынку: " + developer.getSalary() + "$!");
        System.out.println("Ждем вас!!!!");
    }

    Developer getDeveloper();
}
