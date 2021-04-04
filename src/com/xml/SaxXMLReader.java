package com.xml;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.Stack;

/**
 * @author lizhangyu
 * @date 2021/4/3 21:13
 */
public class SaxXMLReader extends DefaultHandler {

    static Stack stack = new Stack();

    public SaxXMLReader() {
        super();
    }

    public static void main(String[] args) {
        long lasting = System.currentTimeMillis();

        try {
            SAXParserFactory sf = SAXParserFactory.newInstance();

            SAXParser sp = sf.newSAXParser();

            SaxXMLReader reader = new SaxXMLReader();

            sp.parse(new InputSource("F:\\test.xml"), reader);
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("运行时间：" + (System.currentTimeMillis() - lasting) + "毫秒");
    }

}
