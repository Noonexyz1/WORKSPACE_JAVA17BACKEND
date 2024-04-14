package org.example;

public class Calle {
    private String number;
    private String name;

    public Calle(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Calle() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Calle{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
