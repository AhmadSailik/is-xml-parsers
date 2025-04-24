package org.example;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileReader;

public class StaxParser {

    private File xmlFile;

    public StaxParser(File xmlFile) {
        this.xmlFile = xmlFile;
    }

    public  void staxParser() throws Exception {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileReader(xmlFile));
        while (reader.hasNext()) {
            int event = reader.next();
            if (event == XMLStreamConstants.CHARACTERS) {
                if (reader.hasText()) {
                    System.out.println("Characters: " + reader.getText().trim());
                }
            }
        }
    }
}
