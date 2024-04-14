package org.example;

public class Location {
    private String name;
    private String url;

    public Location(String name, String url) {
        this.name = name;
        this.url = url;
    }
    public Location() {
    }

    // Getter Methods

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    // Setter Methods

    public void setName( String name ) {
        this.name = name;
    }

    public void setUrl( String url ) {
        this.url = url;
    }
}
