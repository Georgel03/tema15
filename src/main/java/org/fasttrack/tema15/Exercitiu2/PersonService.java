package org.fasttrack.tema15.Exercitiu2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PersonService {

    private List<Person> service = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public PersonService(List<Person> personList) {
        this.service = personList;
    }

    public Person addPerson(Person person) {

        Random random = new Random(System.currentTimeMillis());

        if (!service.contains(person)) {
            System.out.println("Persoana deja adaugata!");
            return person;
        }
        else {
            if (person.getId() <= 0) {
                person.setId(random.nextInt(0, Integer.MAX_VALUE));
            }
            service.add(person);
            System.out.println("Persoana adaugata cu succes!");
            return person;

        }
    }

    public Person removePerson(int id) {

        boolean found = false;
        Person delPers = new Person(0, "0", 0);

        for (Person person : service) {
            if (person.getId() == id) {
                found = true;
                service.remove(person);
                delPers = person;
                break;
            }
        }
        if (found == false) {
            throw new ExceptionForUnfoundPerson("Persoana negasita!");
        }

        return delPers;
    }

    public List<Person> getAllPersons() {

        List<Person> myList = service;

        return myList;
    }

    public List<Person> getAllPersonsOldThn(int age) throws RuntimeException {


        List<Person> myList = new ArrayList<>();
        boolean insert = false;

        while (age <= 0 || age > 120) {
            System.out.print("Dati o valoare valida: ");
            age = scanner.nextInt();
        }

        for (Person person : service) {
            if (person.getAge() >= age) {
                myList.add(person);
                insert = true;
            }
        }

        if (insert == false) {
            System.out.println("Nici o persoana mai in varsta de " + age);
            return new ArrayList<>();
        }

        return myList;
    }

    public List<String> getAllPersonsNames() {

        List<String> personsName = new ArrayList<>();

        for (Person person : service) {
            if (person.getName().equals(null)) {
                throw new ExceptionForNullNames("Nume Invalid!");
            }
            else {
                personsName.add(person.getName());
            }
        }

        return personsName;
    }

    public Person getPerson(String name) {

        boolean found = false;

        if (name.equals(null)) {
            throw new ExceptionForNullNames("Nume Invalid!");
        }

        for (Person person : service) {
            if (person.getName().equals(name)) {
                found = true;
                return person;
            }
        }
        if (found == false) {
            System.out.println("Persona negasita!");
        }

        return null;
    }

    public Person getPersonById(int id) {

        boolean found = false;

        while (id <= 0) {
            System.out.print("Introdu un id valid: ");
            id = scanner.nextInt();
        }

        for (Person person : service) {
            if (person.getId() == id) {
                found = true;
                return person;
            }
        }

        if (found == false) {
           throw new ExceptionForUnfoundPerson("Persoana negasita!");
        }

        return null;
    }
}
