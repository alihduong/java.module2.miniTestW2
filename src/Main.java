import interfaces.Management;
import person.ManagerPerson;
import person.Person;
import person.Students;

import java.awt.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManagerPerson managerPerson=new ManagerPerson();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("------------------------");
            System.out.println("Enter function");
            System.out.println("1: Add new person");
            System.out.println("2: find person by id");
            System.out.println("3: show all person");
            System.out.println("4: edit person");
            System.out.println("5: delete person");
            try{
                int choose= Integer.valueOf(scanner.nextLine());
                switch (choose){
                    case 1:
                        //Thêm mới person
                        managerPerson.addPerson();
                        break;
                    case 2:
                        managerPerson.findPerson();
                        break;
                    case 3:
                        managerPerson.printPersons();
                        break;
                    case 4:
                        managerPerson.editPersonById();
                        break;
                    case 5:
                        managerPerson.deletePersonById();
                        break;
                }
            }catch (Exception e){
                System.out.println("Chọn bằng số nha đm");
                System.out.println(e.getMessage());
            }

        }

    }



}
