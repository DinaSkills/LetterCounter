
package lettercounter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



/**
 * @author Dina
 * 
 */
public class LetterCounter {

   /**
 * This program prompts the user to enter the path of a .txt or .xml file, reads the file, 
 * and counts the occurrences of each letter in the file.
 * @param args the command line arguments.
 */
  public static void main(String[] args){
        // TODO code application logic here
        
          Scanner  input = new Scanner(System.in);
       
          
        /** 
         * @throws IOException if an I/O error occurs while reading the file or file path.
         */
        
        while (true) {
        try {
            System.out.print("Enter the path of the file or type exit to quit: ");
            String pathStr = input.nextLine().trim();

            if (pathStr.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program...");
                break;
            }

            Path path = Paths.get(pathStr);
            PathChecker checkFile = new PathChecker(path);
        } catch (IOException e) {
            System.out.println(e.getMessage());
           
        }
    }
        input.close();

    }
     
  }
