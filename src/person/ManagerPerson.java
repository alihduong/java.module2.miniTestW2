package person;

import interfaces.Management;
import jdk.jfr.internal.tool.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerPerson implements Management {
    Person [] Person;
    @Override
    public void printPersonal() {

    }

    @Override
    public void addPerson() {
        System.out.println("Enter Id");
        Scanner scanner = new Scanner(System.in);
        Main mains = new Main();
    }

    @Override
    public void findPerson() {

    }

    @Override
    public void deletePersonById() {

    }

    @Override
    public void editPersonById() {

    }

    @Override
    public void sortByAverage() {

    }

    @Override
    public void averageScore() {

    }
}
