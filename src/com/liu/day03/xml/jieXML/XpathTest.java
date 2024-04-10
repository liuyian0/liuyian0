package com.liu.day03.xml.jieXML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

//使用xpath技术结合Dom4j技术读取xml文件（了解）
public class XpathTest {
    @Test
    public void demmo01() throws DocumentException {
        //1.创建一个SAXReader对象，调用read方法加载一个xml文件获取文档对象
        SAXReader sr = new SAXReader();
        Document doc = sr.read("src/com/liu/day03/xml/jieXML/books.xml");
        //2.获取book里面所有的作者，不论有多少层
        List<Node> list = doc.selectNodes("//author");
        //3.遍历打印
        for (Node node : list) {
            System.out.println(node.getText());
        }
    }
}
