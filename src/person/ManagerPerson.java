package person;

import interfaces.Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerPerson implements Management {
    List<Person> persons = new ArrayList<>();
    Person[] Person;

    @Override
    public void printPersons() {
        for (Person p : persons) {
            printPersonalById(p.getId());
        }
    }

    @Override
    public void printPersonalById(int id) {
        for (Person p : persons) {
            if (p.getId() == id) {
                System.out.println("----------------------");
                System.out.println(String.format(" Id: %s \n Name: %s \n Age: %s", p.getId(), p.getName(), p.getAge()));
                System.out.println("----------------------");
                break;
            }
        }
    }

    @Override
    public void addPerson() {
        boolean flagId = true;
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id");
        while (true) {
            int id = 0;
            try {
                id = Integer.parseInt(scanner.nextLine());
                for (Person p : persons) {
                    if (p.getId() == id) {
                        System.out.println("Id đã tồn tại!");
                        flagId = false;
                        break;
                    }
                    flagId = true;
                }
            } catch (Exception e) {
                System.out.println("id là kiểu int");
                System.out.println(e.getMessage());
                flagId = false;
            }
            if (flagId) {
                person.setId(id);
                break;
            }
        }

        System.out.println("Enter Name");
        String name = scanner.nextLine();
        while (true) {
            if (name == null || name.trim().equals("")) {
                System.out.println("Tên k hợp lệ!");
                continue;
            }
            person.setName(name);
            break;
        }


        System.out.println("Enter Age");
        try {
            int age = Integer.parseInt(scanner.nextLine());
            person.setAge(age);

        } catch (Exception e) {
            System.out.println("tuổi là kiểu int");
            System.out.println(e.getMessage());
        }
        persons.add(person);
    }

    @Override
    public void findPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id");

        try {
            int id = Integer.parseInt(scanner.nextLine());
            for (Person p : persons) {
                if (p.getId() == id) {
                    printPersonalById(p.getId());
                }
            }
        } catch (Exception e) {
            System.out.println("id là kiểu int");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deletePersonById() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Id");

        try {
            List<Person> newPersons = new ArrayList<>();

            int id = Integer.parseInt(scanner.nextLine());
            for (Person p : persons) {
                if (p.getId() == id) {
                    continue;
                }
                newPersons.add(p);
            }
            persons = newPersons;
        } catch (Exception e) {
            System.out.println("id là kiểu int");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void editPersonById() {
        Scanner scanner = new Scanner(System.in);
        boolean flagEdit = false;
        System.out.println("Enter Id");
        try {

            int id = Integer.parseInt(scanner.nextLine());
            for (Person p : persons) {
                if (p.getId() == id) {
                    flagEdit = true;
                    System.out.println("Enter Name");
                    String name = scanner.nextLine();
                    while (true) {
                        if (name == null || name.trim().equals("")) {
                            System.out.println("Tên k hợp lệ!");
                            continue;
                        }
                        p.setName(name);
                        break;
                    }


                    System.out.println("Enter Age");
                    try {
                        int age = Integer.parseInt(scanner.nextLine());
                        p.setAge(age);

                    } catch (Exception e) {
                        System.out.println("tuổi là kiểu int");
                        System.out.println(e.getMessage());
                    }

                }
                if (!flagEdit) {
                    System.out.println(String.format("Không tìm thấy học sinh với id = %s", id));
                }

            }
        } catch (Exception e) {
            System.out.println("id là kiểu int");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void sortByAverage() {

    }

    @Override
    public void averageScore() {

    }
}
