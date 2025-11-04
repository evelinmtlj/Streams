package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the  gutter.
public class Program {
    public static void main(String[] args) {

List<Person> persons = new ArrayList<>();

        persons.add(new Person("Ethan","Brooks",24));
        persons.add(new Person("Eric","Martinez",17));
        persons.add(new Person("Jennifer","Cruz",19));
        persons.add(new Person("Chloe","Rivera",29));
        persons.add(new Person("Liam","Parker",30));
        persons.add(new Person("Noah","Ramirez",21));
        persons.add(new Person("Ashley","Perez",12));
        persons.add(new Person("Karen","Gomez",22));
        persons.add(new Person("Mia","Foster",26));
        persons.add(new Person("Lucas","Collins",14));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for first or last name type in:");
        String searchResults = scanner.nextLine().toLowerCase();

        //new list
        List<Person> matches = new ArrayList<>();

        for(Person p : persons) {
            if(p.getFirstName().toLowerCase().contains(searchResults) ||
            p.getLastName().toLowerCase().contains(searchResults)) {
                matches.add(p);
                System.out.println(p.getFirstName() + " " + p.getLastName());

            }

        }
    }
}