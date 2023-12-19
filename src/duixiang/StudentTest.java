package duixiang;

public class StudentTest {
public static void main(String[] args) {
  Student s = new Student();
  s.study(); 
  s.name = "张三";
  s.setAge(18);
  System.out.println(s.name+s.getAge());
}
}
