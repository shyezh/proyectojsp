/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fje.daw2;

import java.io.File;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author weily
 */
public class EscrituraXMLDOM {
        public static void crear() throws RemoteException, NotBoundException {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("PROYECTO");
            doc.appendChild(rootElement);

            Element staff = doc.createElement("TASCA");
            rootElement.appendChild(staff);

            Element firstname = doc.createElement("nombre");
            firstname.appendChild(doc.createTextNode("PROYECTO1"));
            staff.appendChild(firstname);

            Element lastname = doc.createElement("descripcio");
            lastname.appendChild(doc.createTextNode("COSAS"));
            staff.appendChild(lastname);

            Element nickname = doc.createElement("durada");
            nickname.appendChild(doc.createTextNode("15"));
            staff.appendChild(nickname);

            Element salary = doc.createElement("realizat");
            salary.appendChild(doc.createTextNode("SI"));
            staff.appendChild(salary);

            Element staf = doc.createElement("TASCA");
            rootElement.appendChild(staf);

            Element firstnam = doc.createElement("nombre");
            firstnam.appendChild(doc.createTextNode("PROYECTO2"));
            staf.appendChild(firstnam);

            Element lastnam = doc.createElement("descripcio");
            lastnam.appendChild(doc.createTextNode("COSAS"));
            staf.appendChild(lastnam);

            Element nicknam = doc.createElement("durada");
            nicknam.appendChild(doc.createTextNode("15"));
            staf.appendChild(nicknam);

            Element salar = doc.createElement("realizat");
            salar.appendChild(doc.createTextNode("SI"));
            staf.appendChild(salar);

            Element sta = doc.createElement("TASCA");
            rootElement.appendChild(sta);

            Element firstna = doc.createElement("nombre");
            firstna.appendChild(doc.createTextNode("PROYECTO3"));
            sta.appendChild(firstna);

            Element lastna = doc.createElement("descripcio");
            lastna.appendChild(doc.createTextNode("COSAS"));
            sta.appendChild(lastna);

            Element nickna = doc.createElement("durada");
            nickna.appendChild(doc.createTextNode("15"));
            sta.appendChild(nickna);

            Element sala = doc.createElement("realizat");
            sala.appendChild(doc.createTextNode("NO"));
            sta.appendChild(sala);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("file2.xml"));

            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (ParserConfigurationException | TransformerException pce) {
        }
    }
    
}
