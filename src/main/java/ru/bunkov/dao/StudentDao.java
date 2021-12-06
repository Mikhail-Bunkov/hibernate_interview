package ru.bunkov.dao;

import ru.bunkov.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class StudentDao {

    private EntityManager em;

    public StudentDao(EntityManagerFactory em) {
        this.em = em.createEntityManager();
    }

    //Возникает вопрос, а нужен ли этот метод, если есть update с merge()?
    public void insert(Student student){
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }

    public void update(Student student){
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
    }

    public void delete(long id){
        em.getTransaction().begin();
        Student student = em.getReference(Student.class, id);
        em.remove(student);
        em.getTransaction().commit();
    }

    public Student select(long id){
        return em.find(Student.class, id);
    }

    public List<Student> findAll(){
        return em.createQuery("select s from Student s", Student.class).getResultList();
    }
}
