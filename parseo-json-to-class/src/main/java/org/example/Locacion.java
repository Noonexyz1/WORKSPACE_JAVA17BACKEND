package org.example;

public class Locacion {
    private Calle street;
    private String city;
    private String state;
    private String country;
    private String postcode;
    private Coordenada coordinates;
    private ZonaHoraria timezone;


    public Locacion(Calle street, String city, String state, String country, String postcode, Coordenada coordinates, ZonaHoraria timezone) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postcode = postcode;
        this.coordinates = coordinates;
        this.timezone = timezone;
    }
    public Locacion(){}

    public Calle getStreet() {
        return street;
    }

    public void setStreet(Calle street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Coordenada getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordenada coordinates) {
        this.coordinates = coordinates;
    }

    public ZonaHoraria getTimezone() {
        return timezone;
    }

    public void setTimezone(ZonaHoraria timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "Locacion{" +
                "street=" + street.toString() +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postcode='" + postcode + '\'' +
                ", coordinates=" + coordinates.toString() +
                ", timezone=" + timezone.toString() +
                '}';
    }
}
