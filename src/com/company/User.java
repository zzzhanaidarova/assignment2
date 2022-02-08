package com.company;
import java.lang.String;
public class User {
    private String firstName;
    private String secondName;
    private int id;
    private int age;
    private String gender;
    private String password;
    private String dateOfBirth;
    private static int id_gen=1;
    public User()
    {
        id=id_gen++;
    }
    public User(String firstName, String secondName, int id, int age, String gender, String password, String dateOfBirth)
    {
        this();
        setFirstName(firstName);
        setSecondName(secondName);
        setAge(age);
        setGender(gender);
        setPassword(password);
        setDateOfBirth(dateOfBirth);
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getSecondName(){
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
