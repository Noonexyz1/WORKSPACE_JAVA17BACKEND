package org.example;

import java.util.List;

public class Persona {
    private List<Resultado> results;
    private Infos info;

    public Persona(List<Resultado> results, Infos info) {
        this.results = results;
        this.info = info;
    }
    public Persona(){}

    public List<Resultado> getResults() {
        return results;
    }

    public void setResults(List<Resultado> results) {
        this.results = results;
    }

    public Infos getInfo() {
        return info;
    }

    public void setInfo(Infos info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "results=" + results.toString() +
                ", info=" + info.toString() +
                '}';
    }
}
