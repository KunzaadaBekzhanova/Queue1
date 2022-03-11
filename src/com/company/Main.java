package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, Data> user = new HashMap<Car, Data>();
        user.put(new Car(1,"A215B"),new Data(2004,"Toyota","Black"));
        user.put(new Car(2,"G265M"),new Data(2010,"Ferrari","White"));
        user.put(new Car(3,"V247L"),new Data(2019,"Lada","Red"));
        user.put(new Car(4,"X566Z"),new Data(2007,"Honda","Gray"));
        user.put(new Car(5,"N655M"),new Data(2022,"Lexus","Gold"));


        for(Map.Entry<Car, Data> item : user.entrySet()){

            System.out.println("Key: "+item.getKey()+" Value: "+item.getValue().getModel()+", "+ item.getValue().getSince()+", "+item.getValue().getColor());
        }
    }
}
