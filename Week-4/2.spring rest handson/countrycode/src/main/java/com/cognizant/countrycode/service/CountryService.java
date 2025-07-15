package com.cognizant.countrycode.service;

import com.cognizant.countrycode.model.Country;
import org.springframework.stereotype.Service;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    public Country getCountry(String code) throws Exception {
        List<Country> countries = loadCountriesFromXML();
        for (Country c : countries) {
            if (c.getCode().equalsIgnoreCase(code)) {
                return c;
            }
        }
        throw new Exception("Country not found: " + code);
    }

    private List<Country> loadCountriesFromXML() throws Exception {
        List<Country> countryList = new ArrayList<>();
        InputStream is = getClass().getClassLoader().getResourceAsStream("country.xml");
        if (is == null) {
            throw new Exception("country.xml not found in classpath");
        }

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(is);
        doc.getDocumentElement().normalize();

        NodeList nodeList = doc.getElementsByTagName("country");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String code = element.getElementsByTagName("code").item(0).getTextContent();
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                countryList.add(new Country(code, name));
            }
        }

        return countryList;
    }
}