package org.example;

public class ZonaHoraria {
    private String offset;
    private String description;

    public ZonaHoraria(String offset, String description) {
        this.offset = offset;
        this.description = description;
    }

    public ZonaHoraria() {
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ZonaHoraria{" +
                "offset='" + offset + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
