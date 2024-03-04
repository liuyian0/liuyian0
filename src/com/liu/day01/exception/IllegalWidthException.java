package com.liu.day01.exception;
//自定义非法的宽度异常
public class IllegalWidthException extends Exception{
    public IllegalWidthException(){
        super();
    }
    public IllegalWidthException(String message){
        super(message);
    }
}
