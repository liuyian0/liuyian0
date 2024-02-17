package com.liu.day01.demo;

//枚举中的构造函数必须是私有的
public enum Color {
    RED("FF0000"),
    GREEN("00FF00"),
    BLUE("0000FF");
    private String hexCode;
    private Color(String hexCode){
        this.hexCode = hexCode;
    }
    public String getHexCode(){
        return hexCode;
    }
}
