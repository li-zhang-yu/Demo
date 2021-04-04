package com.xml;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * @author lizhangyu
 * @date 2021/4/3 20:40
 */
public class MyXMLReader {

    public static void main(String[] args) {
        long lasting = System.currentTimeMillis();

        File file = new File("F:\\test.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(file);

            System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + "毫秒");

            NodeList  nodeList = document.getElementsByTagName("VALUE");

            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println("车牌号码：" + document.getElementsByTagName("NO").item(i).getFirstChild().getNodeValue());
                System.out.println("车牌地址：" + document.getElementsByTagName("ADDR").item(i).getFirstChild().getNodeValue());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
