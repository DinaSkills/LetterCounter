
package lettercounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author Dina
 */
public class LetterCounter {

   /**
 * This program prompts the user to enter the path of a .txt or .xml file, reads the file, 
 * and counts the occurrences of each letter in the file.
 * 
 * @param args the command line arguments.
 * @throws IOException if an I/O error occurs while reading the file.
 * @throws ParserConfigurationException if a DocumentBuilder cannot be created.
 * @throws SAXException if any parse errors occur while parsing the XML document.
 */
  public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        // TODO code application logic here
       
        
    Scanner input = new Scanner(System.in);
        System.out.print("Enter path of file : ");
        Path path = null;
        FileTxt txt;
        FileXml xml;
     
            
        while (true){
            
            path = Paths.get(input.nextLine());
                   if(path.toString().isEmpty()){
                       System.out.println("The specified path can not be empty enter file path  type exit:");
                            continue;
                   }else if (Files.isDirectory(path)) {
                            System.out.println("The specified path directory enter file or type exit:");
                            continue;
                   }else if(path.toString().toLowerCase().contains("exit")) {
                    System.out.println("Exiting the program...");
                    System.exit(0);
                    }    
        String fileName = path.getFileName().toString();   
              if (fileName.endsWith(".txt")) {
                      txt = new FileTxt(path);
                } else if (fileName.endsWith(".xml")) {
                      xml = new FileXml(path);
                }else{
                    System.out.println("It is not file path nor is not a .txt or .xml file.To exit, type exit.");
                    continue;
                }   
        break;
        }
       
        input.close(); 
        
    }
  }
 
