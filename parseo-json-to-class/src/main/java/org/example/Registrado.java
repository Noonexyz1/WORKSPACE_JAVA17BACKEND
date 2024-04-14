package org.example;

public class Registrado {
    private String date;
    private int age;

    public Registrado(String date, int age) {
        this.date = date;
        this.age = age;
    }

    public Registrado() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Registrado{" +
                "date='" + date + '\'' +
                ", age=" + age +
                '}';
    }
}
