package org.example;

import org.xml.sax.*;
import org.xml.sax.helpers.*;

public class SaxHandler extends DefaultHandler {
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        System.out.println("Start Element: " + qName);
    }

    public void endElement(String uri, String localName, String qName) {
        System.out.println("End Element: " + qName);
    }

    public void characters(char[] ch, int start, int length) {
        System.out.println("Characters: " + new String(ch, start, length));
    }
}
