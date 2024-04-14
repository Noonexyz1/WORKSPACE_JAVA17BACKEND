package org.example;

public class IdPersona {
    private String name;
    private String value;

    public IdPersona(String name, String value) {
        this.name = name;
        this.value = value;
    }
    public IdPersona(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IdPersona{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
