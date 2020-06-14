package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car implements Comparable<Car>{
    //Zad1
        public String model;
        public Integer rok;

        public Car(String model, Integer rok) {
            if (model == null || rok == null) {
                throw new IllegalArgumentException("Model oraz rok produkcji muszą zostać podane");
            }
            this.model = model;
            this.rok = rok;
        }
        public int compareTo(Car other){
            return this.rok - other.rok;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", rok=" + rok +
                    '}';
        }
        public static void main (String[] args){

            String model11 = "Dodge";
            Integer rok11 = 1989;
            String model1 = "Volvo";
            Integer rok1 = 1990;
            String model2 = "Alfa Romeo";
            Integer rok2 = 1991;
            String model3 = "Mercedes";
            Integer rok3 = 1992;
            String model4 = "Suzuki";
            Integer rok4 = 1993;
            String model5 = "Alpina";
            Integer rok5 = 1994;
            String model6 = "BMW";
            Integer rok6 = 1995;
            String model7 = "Chrysler";
            Integer rok7 = 1996;
            String model8 = "Reanult";
            Integer rok8 = 1997;
            String model9 = "Gugatti EB110";
            Integer rok9 = 1998;


            Car car_10 = new Car(model11, rok11);
            Car car_9 = new Car(model1, rok1);
            Car car_8 = new Car(model2, rok2);
            Car car_6 = new Car(model3, rok3);
            Car car_7 = new Car(model4, rok4);
            Car car_5 = new Car(model5, rok5);
            Car car_2 = new Car(model6, rok6);
            Car car_3 = new Car(model7, rok7);
            Car car_4 = new Car(model8, rok8);
            Car car_1 = new Car(model9, rok9);

            List<Car> cars=new ArrayList<>();

            cars.add(car_1);
            cars.add(car_2);
            cars.add(car_3);
            cars.add(car_4);
            cars.add(car_5);
            cars.add(car_6);
            cars.add(car_7);
            cars.add(car_8);
            cars.add(car_9);
            cars.add(car_10);

            Collections.sort(cars);
            for(Car i: cars){
                System.out.println(i);
            }

        }
}
