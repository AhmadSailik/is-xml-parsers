package org.example;

import jakarta.xml.bind.*;

import java.io.File;

public class JaxbParsing {

    private File xmlFile;

    public JaxbParsing(File xmlFile) {
        this.xmlFile = xmlFile;
    }

    public void jaxbParsing() throws Exception {
        JAXBContext context = JAXBContext.newInstance(Catalog.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Catalog catalog = (Catalog) unmarshaller.unmarshal(xmlFile);

        for (Book book : catalog.getBooks()) {
            System.out.println("[" + book.getId() + "] " + book.getTitle() + " by " + book.getAuthor());
            System.out.println(" Genre: " + book.getGenre());
            System.out.println(" Price: $" + book.getPrice());
            System.out.println(" Published: " + book.getPublishDate());
            System.out.println(" Description: " + book.getDescription());
            System.out.println();
        }
    }
}
