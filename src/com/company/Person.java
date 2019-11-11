package com.company;
public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
    @Override
    public int compareTo(Person other) {
        int cmp;
        if(0 != (cmp = lastName.compareTo(other.lastName))) {
            return cmp;
        }
        if(0 != (cmp = firstName.compareTo(other.firstName))){
            return cmp;
        }
        return 0;
    }
}