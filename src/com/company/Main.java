package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            User user = new User();
            user.setFirstName(scan.next());
            user.setSecondName(scan.next());
            int age = scan.nextInt();
            user.setAge(age);
            if(!(Validator.checkAge(age))){
                System.out.println("The age is less than 18, so you don't allowed");
                break;
            }
            user.setGender(scan.next());
            String password = scan.next();
            user.setPassword(password);
            if(!Validator.checkPassword(password)){
                System.out.println("The password was written wrong way, write again all data");
                break;
            }
            String dateOfBirth = scan.next();
            if(!Validator.checkDate(dateOfBirth)){
                System.out.println("The Date was written wrong way, write again all data");
                break;
            }
            user.setDateOfBirth(dateOfBirth);
            System.out.println("------------");
            System.out.println("ID: " + user.getId());
            System.out.println("Name: " + user.getFirstName());
            System.out.println("Surname: " + user.getSecondName());
            System.out.println("Age: " + user.getAge());
            System.out.println("Gender: " + user.getGender());
            System.out.println("Password: " + user.getPassword());
            System.out.println("Date of birth: " + user.getDateOfBirth());
        }
    }
}