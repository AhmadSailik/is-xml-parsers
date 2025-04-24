package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.*;

import java.io.File;

public class DomParser {

    private File xmlFile;

    public DomParser(File xmlFile) {
        this.xmlFile = xmlFile;
    }

    public void domParser() throws Exception {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder= factory.newDocumentBuilder();
        Document document = builder.parse(xmlFile);
        NodeList nodeList = document.getElementsByTagName("author");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println(node.getTextContent());
        }
    }
}
