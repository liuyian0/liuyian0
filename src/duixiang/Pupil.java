package duixiang;

public class Pupil {
private String name;
private int age;
//无参构造
public Pupil(){}
//有参构造
public Pupil (String name,int age){
    this.name = name;
    this.age = age;
}
public void show(){
    System.out.println(name+","+age);
}
}
