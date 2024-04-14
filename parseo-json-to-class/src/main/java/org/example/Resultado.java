package org.example;

public class Resultado {
    private String gender;
    private Nombre name;
    private Locacion location;
    private String email;
    private Login login;
    private Dob dob;
    private Registrado registered;
    private String phone;
    private String cell;
    private IdPersona id;
    private Imagen picture;
    private String nat;


    public Resultado(String gender, Nombre name, Locacion location, String email, Login login, Dob dob, Registrado registered, String phone, String cell, IdPersona id, Imagen picture, String nat) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
        this.dob = dob;
        this.registered = registered;
        this.phone = phone;
        this.cell = cell;
        this.id = id;
        this.picture = picture;
        this.nat = nat;
    }
    public Resultado(){}

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Nombre getName() {
        return name;
    }

    public void setName(Nombre name) {
        this.name = name;
    }

    public Locacion getLocation() {
        return location;
    }

    public void setLocation(Locacion location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Dob getDob() {
        return dob;
    }

    public void setDob(Dob dob) {
        this.dob = dob;
    }

    public Registrado getRegistered() {
        return registered;
    }

    public void setRegistered(Registrado registered) {
        this.registered = registered;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public IdPersona getId() {
        return id;
    }

    public void setId(IdPersona id) {
        this.id = id;
    }

    public Imagen getPicture() {
        return picture;
    }

    public void setPicture(Imagen picture) {
        this.picture = picture;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "gender='" + gender + '\'' +
                ", name=" + name.toString() +
                ", location=" + location.toString() +
                ", email='" + email + '\'' +
                ", login=" + login.toString() +
                ", dob=" + dob.toString() +
                ", registered=" + registered.toString() +
                ", phone='" + phone + '\'' +
                ", cell='" + cell + '\'' +
                ", id=" + id.toString() +
                ", picture=" + picture.toString() +
                ", nat='" + nat + '\'' +
                '}';
    }
}
