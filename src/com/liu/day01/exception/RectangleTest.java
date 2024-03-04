package com.liu.day01.exception;

public class RectangleTest {
    public static void main(String[] args) {
        try {
            Rectangle r = new Rectangle(1,0);
            System.out.println(r.getArea());
        } catch (IllegalWidthException e) {
            e.printStackTrace();
        } catch (IllegalLengthException e) {
            e.printStackTrace();
        }
    }
}
