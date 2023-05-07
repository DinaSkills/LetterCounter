
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
      */
     
    
     public FileXml(Path filepath){
         super(filepath);
         processFile();
     }
     
      /**

        This method processes an XML file by parsing its
        contents and counting the number of vowels its element values
        and the number of consonants in the entire file.

        @throws IOException in case of an IO error during file processing.

        @throws ParserConfigurationException in case of a configuration error during XML parsing.

        @throws SAXException in case of a SAX error during XML parsing.
*/
      
    
    private void processFile() {
        try{ 
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File(this.filepath.toString()));
         
        NodeList nodes = document.getDocumentElement().getChildNodes();
        String elementValue = null;
        for (int i = 0; i < nodes.getLength(); i++) {
                if (nodes.item(i).getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                    Element element = (Element) nodes.item(i);
                    elementValue = element.getTextContent().toLowerCase();    
                }  
        }
          String fileContent = getFileContent(this.filepath.toString());
          
           countVowels(elementValue);  
           countConsonants(fileContent);
           showResult();
        
        }catch (IOException | ParserConfigurationException | SAXException e) {
                    System.out.println(e.getMessage());

            }
}
}