package org.example;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        File xmlFile = new File("D:/git_repo/is-xml-parsers/src/main/resources/files/catalog.xml");
        DomParser domParser=new DomParser(xmlFile);
//        domParser.domParser();
        JaxbParsing jaxbParsing=new JaxbParsing(xmlFile);
//        jaxbParsing.jaxbParsing();

        SaxParser saxParser=new SaxParser(xmlFile);
//        saxParser.saxParser();
        StaxParser staxParser=new StaxParser(xmlFile);
//        staxParser.staxParser();

    }
}