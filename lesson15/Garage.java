package com.alevel.lesson15;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Vehicle> {


    List<T> transport = new ArrayList<>();

    public T get(int i) {
        return transport.get(i);

    }


    public void add(T value) {
        transport.add(value);
    }

    public List<T> getByType(Class<?> classType) {

        List<T> list = new ArrayList<>();
        for (T vehicle : transport) {
            if (classType.isInstance(vehicle)) {
                list.add(vehicle);
            }
        }
return list;
    }


    public static void main(String[] args) {
        Garage<Vehicle> garageVehicle = new Garage<>();
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        garageVehicle.add(car);
        garageVehicle.add(bicycle);
        garageVehicle.add(vehicle);
        Vehicle obj1 = garageVehicle.get(2);
        System.out.println(obj1);

        garageVehicle.getByType(Car.class);

    }


}
