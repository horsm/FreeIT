package com.freeit.lesson10;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XSDValidator {
    public static void main(String[] args) {
        String pathXSD = "src/com/freeit/lesson10/devicesXSDscheme.xsd";
        String pathXML = "src/com/freeit/lesson10/devices.xml";

        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(pathXSD));
            Validator validator = schema.newValidator();
                validator.validate(new StreamSource(new File(pathXML)));
            } catch (IOException | SAXException e) {
            System.out.println("Проверка не пройдена!");
            e.printStackTrace();

        }
        System.out.println("Проверка прошла успешна!");
    }
}
