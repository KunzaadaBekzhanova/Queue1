package com.company;

public class Data {
    private int since;
    private String model;
    public String color;

    public Data() {
    }

    public Data(int since, String model, String color) {
        this.since = since;
        this.model = model;
        this.color = color;
    }

    public int getSince() {
        return since;
    }

    public void setSince(int since) {
        this.since = since;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Data{" +
                "since='" + since + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
