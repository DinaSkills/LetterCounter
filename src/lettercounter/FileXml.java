
package lettercounter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Dina
 */
public class FileXml extends FileProcessor {
    
    
     /**
        * Constructs a FileXml object with the specified file path.
        * 
        * @param filepath the path of the file to be processed
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
      */
     
    
     public FileXml(Path filepath) throws IOException, ParserConfigurationException, SAXException{
         super(filepath);
         processFile();
         showResult();
     }
     
      /**

        This method processes an XML file by parsing its
        contents and counting the number of vowels its element values
        and the number of consonants in the entire file.

        @throws IOException in case of an IO error during file processing.

        @throws ParserConfigurationException in case of a configuration error during XML parsing.

        @throws SAXException in case of a SAX error during XML parsing.
*/
      
    
    private void processFile() throws IOException, ParserConfigurationException, SAXException {
        
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File(filepath.toString()));
         
           NodeList nodes = document.getDocumentElement().getChildNodes();
           
        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                Element element = (Element) nodes.item(i);
                String elementValue = element.getTextContent().toLowerCase();
                countVowels(elementValue);
            }
            
           String fileContent = getFileContent(filepath.toString());
           countConsonants(fileContent);
        }
    }
}
