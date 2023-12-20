package duixiang;

public class Student {
    //成员变量
    public String name;//public可以省略
    private int age;

    //提供get/set方法
    public void setAge(int a){
        if (a < 0) {
            System.out.println("您输入的年龄有误");
        } else {
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
    //成员方法
    public void study(){
        System.out.println("好好学习，天天向上");
    }

}
