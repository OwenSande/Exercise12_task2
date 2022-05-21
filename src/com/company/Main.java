package com.company;

public class Main {

    public static void main(String[] args) {

	    TrafficLights t1 = new TrafficLights();

        for (int i = 0; i < 9; i++){

            System.out.println(t1);
            t1.changeColor();
        }
    }
}
