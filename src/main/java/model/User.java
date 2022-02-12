package model;

public class User {
    int pid;
    String name;
    String surname;
    int age;

    public User() {
    }

    public User(int pid, String name, String surname, int age) {
        this.pid = pid;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
