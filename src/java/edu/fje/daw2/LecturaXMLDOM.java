package edu.fje.daw2;


import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 * Classe que llegeix un document mitjançant JAXP i DOM
 * @author sergi grau
 * @version 1.0 11/02/2014
 */ 
public class LecturaXMLDOM {

    public static void lectura() {
        
        try {

            File stocks = new File("file2.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(stocks);
            doc.getDocumentElement().normalize();

            System.out.println("arrel " + doc.getDocumentElement().getNodeName());
            NodeList nodes = doc.getElementsByTagName("PROYECTO");
            System.out.println("arrel " + doc.getDocumentElement().getNodeName());
            NodeList nodes1 = doc.getElementsByTagName("TASCA");
            System.out.println("arrel " + doc.getDocumentElement().getNodeName());

            for (int i = 0; i < nodes1.getLength(); i++) {
                Node nodes11 = nodes1.item(i);
            
                if (nodes11.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println("==========================");
                    Element element = (Element) nodes11;
                    System.out.println("nombre: " + obtenirContingut("nombre", element));
                    System.out.println("descripcio: " + obtenirContingut("descripcio", element));
                    System.out.println("durada: " + obtenirContingut("durada", element));
                    System.out.println("realizat: " + obtenirContingut("realizat", element));
                   
                }   
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static String obtenirContingut(String etiqueta, Element element) {
        NodeList nodes = element.getElementsByTagName(etiqueta).item(0).getChildNodes();
        Node node = (Node) nodes.item(0);
        return node.getNodeValue();
    }
}