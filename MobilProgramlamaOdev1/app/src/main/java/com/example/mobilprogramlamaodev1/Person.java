package com.example.mobilprogramlamaodev1;

import java.util.ArrayList;

public class Person {
    private static String userName;
    private static Object password;

    public  Person(String userName, String password, int photoId){
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {return (String) password; }
    public  void  setPassword(String password) { this.password = password;}
    public  String getUserName() {return userName;}

    public void setUserName(String userName) { this.userName = userName; }

    public static ArrayList<Person> getPersonsList() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person( userName:"tugrul", password:"123",R.drawable));
        persons.add(new Person( userName:"android", password:"456",R.drawable));
        return persons;

    }
}
