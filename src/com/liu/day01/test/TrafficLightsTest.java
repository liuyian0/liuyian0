package com.liu.day01.test;
import com.liu.day01.demo.TrafficLights;

public class TrafficLightsTest {
    public static void main(String[] args) {
        change(TrafficLights.GREEN);
    }

    private static void change(TrafficLights green) {
    switch (green){
        case RED :
            System.out.println("红灯停");
            break;
        case YELLOW:
            System.out.println("黄灯等一等");
            break;
        case GREEN:
            System.out.println("绿灯行");
             break;
    }
    }
}
