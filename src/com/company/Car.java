package com.company;

public class Car {
    private int id;
    private String number;

    public Car(){

    }
    public Car(int id, String number){
        this.id = id;
        this.number = number;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
