package com.liu.day01.exception;
//自定义非法的长度异常
public class IllegalLengthException extends Exception{
    public IllegalLengthException(){
        super();
    }
    public IllegalLengthException(String message){
        super(message);
    }
}
