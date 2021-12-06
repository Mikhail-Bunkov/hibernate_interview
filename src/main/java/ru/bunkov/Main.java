package ru.bunkov;

import ru.bunkov.dao.StudentDao;
import ru.bunkov.entity.Student;

public class Main {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao(SessionFactorySingleton.getSessionFactory());

//        dao.insert(new Student("Ivan",4));
//        dao.insert(new Student("Petr",5));
//        dao.insert(new Student("Jim",3));
//        dao.insert(new Student("John",4));
//        dao.insert(new Student("Daniil",4));
//        dao.insert(new Student("Alexander",2));
//        dao.insert(new Student("Yuriy",3));
//        dao.insert(new Student("Stephan",4));
//        dao.insert(new Student("Andrew",5));


//        System.out.println(dao.select(3));
//        System.out.println(dao.select(2));
//        System.out.println(dao.select(5));
//        System.out.println(dao.select(7));
//        System.out.println(dao.select(8));
//
//        dao.delete(4);
//        System.out.println(dao.select(4));
//        dao.update(new Student(2,"Orion",5));
//        System.out.println(dao.select(2));
/////////////////     Все работает исправно!
    }
}
