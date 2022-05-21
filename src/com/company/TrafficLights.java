package com.company;

public class TrafficLights {
    TrafficLightColor tlc = TrafficLightColor.red;

    public void changeColor(){
        switch(tlc){

            case red   : tlc = TrafficLightColor.green ; break;
            case yellow: tlc = TrafficLightColor.red   ; break;
            case green : tlc = TrafficLightColor.yellow ; break;

        }
    }
    public  String toString(){return " current color "+ tlc;}

}
