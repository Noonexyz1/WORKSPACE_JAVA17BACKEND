package org.example;

public class Origin {
    private String name;
    private String url;

    public Origin(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public Origin() {
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
