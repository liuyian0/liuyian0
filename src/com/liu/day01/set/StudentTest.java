package com.liu.day01.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",18,Gender.MAN);
        Student s2 = new Student("赵四",20,Gender.WOMAN);
        Student s3 = new Student("王老五",19,Gender.MAN);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
        //[Student{name='张三', age=18, gender=MAN}, Student{name='赵四', age=20, gender=WOMAN}, Student{name='王老五', age=19, gender=MAN}]
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);
        //[Student{name='张三', age=18, gender=MAN}, Student{name='王老五', age=19, gender=MAN}, Student{name='赵四', age=20, gender=WOMAN}]
    }
}
