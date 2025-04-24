package org.example;

import javax.xml.parsers.*;

import java.io.File;

public class SaxParser {
    private File xmlFile;

    public SaxParser(File xmlFile) {
        this.xmlFile = xmlFile;
    }

    public void saxParser() throws Exception {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        saxParser.parse(xmlFile, new SaxHandler());
    }
}
