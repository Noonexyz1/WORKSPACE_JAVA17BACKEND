package org.example;

public class Imagen {
    private String large;
    private String medium;
    private String thumbnail;

    public Imagen(String large, String medium, String thumbnail) {
        this.large = large;
        this.medium = medium;
        this.thumbnail = thumbnail;
    }

    public Imagen(){}

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "large='" + large + '\'' +
                ", medium='" + medium + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
