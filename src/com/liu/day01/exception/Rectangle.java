package com.liu.day01.exception;
//描述矩形
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width)throws IllegalWidthException,IllegalLengthException{
        //对长和宽进行合法性验证
        if (length<=0){
            throw new IllegalLengthException("非法长度");
        }
        if (width<=0){
            throw new IllegalWidthException("非法宽度");
        }
        this.length = length;
        this.width = width;

    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
}
