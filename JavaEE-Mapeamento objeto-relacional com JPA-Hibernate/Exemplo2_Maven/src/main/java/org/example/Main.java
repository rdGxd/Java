package org.example;

import dominio.Pessoa;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        /*
        Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
        Pessoa p2 = new Pessoa(null, "Rodrigo H", "rodrigo@gmail.com");
        Pessoa p3 = new Pessoa(null, "Ana Ana", "ana@gmail.com");
         */

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        /*
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
         */

        // Uma entidade monitarada é uma entidade que acabou de ter sido inserida ou recuperada do banco de dados

        // Encontrando uma pessoa
        Pessoa p = em.find(Pessoa.class, 2);

        // Removendo pessoa -> Sempre que uma operação que nao seja uma simples consulta coloque uma transação
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}