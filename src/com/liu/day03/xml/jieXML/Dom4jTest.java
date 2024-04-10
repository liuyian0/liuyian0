package com.liu.day03.xml.jieXML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

//解析xml文件的内容，把每个book解析成一个对象，将book对象存放到一个集合中
public class Dom4jTest {
    public static void main(String[] args) throws DocumentException {
        //1.定义一个集合存放book对象
        ArrayList<Books> books = new ArrayList<>();
        //2.创建一个SAXReader对象，调用read方法加载一个xml文件获得文档对象
        SAXReader sr = new SAXReader();
        Document doc = sr.read("src/com/liu/day03/xml/jieXML/books.xml");
        //2.通过文档对象，获取根元素
        Element rootElement = doc.getRootElement();
        //3.通过根元素一层一层进行解析子元素
        List<Element> bookElement = rootElement.elements("book");
        for (Element element : bookElement) {
            //解析属性
            String id = element.attributeValue("id");
            //获取子元素文本
            String name = element.elementText("name");
            String author = element.elementText("author");
            String price = element.elementText("price");
            //4.将字符串封装成对象，并放到集合中
            Books book = new Books(id,name,author,price);
            books.add(book);
        }
        //5.遍历集合
        for (Books book : books) {
            System.out.println("book = " + book);
        }
    }
}
