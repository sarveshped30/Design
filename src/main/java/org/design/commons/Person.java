package org.design.commons;

import java.lang.reflect.Modifier;
import java.util.*;

import java.lang.reflect.Field;

public final class Person {

    private final String name;
    private final int age;
    private final List<String> address;

    public Person(String name, int age, List<String> address) {
        this.name = name;
        this.age = age;
        this.address = new ArrayList<>(address);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getAddress() {
        return Collections.unmodifiableList(address);
    }

    public String toString() {
        return String.format("Person {name : %s, age : %d}", name, age);
    }

}

class Main {
    public static void main(String[] args) {
        Person person = new Person("Sarvesh", 23, Arrays.asList("sonali", "suryakant", "sneha"));
        System.out.println(person);
        System.out.println(person.getAddress());
        //person.getAddress().set(0, null);       //Throws an unsupportedOperationException
        //person.getAddress().add("Sarvesh");      // UnsupportedOperationException

        //Use Reflection api

        /*try {
           Field nameField = person.getClass().getDeclaredField("name");
            nameField.setAccessible(true);


           Field ageField = person.getClass().getDeclaredField("age");
           ageField.setAccessible(true);
           ageField.setInt(ageField, ageField.getModifiers() & ~Modifier.FINAL);

           ageField.setInt(ageField, 24);
        } catch(NoSuchFieldException | IllegalAccessException ex) {
            ex.printStackTrace();
        }

        System.out.println(person);*/

    }
}
