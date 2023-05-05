
package lettercounter;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dina
 */
public class FileProcessor {
     protected Path filepath;
     protected String fileName;
     protected int NumVowels;
     protected int NumConsonants;
     protected final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');
     
     
    
     /**
        * Constructs a FileProcessor object with the specified file path.
        * 
        * @param filepath the path of the file to be processed
      */
     
     
     public FileProcessor(Path filepath){
         this.filepath = filepath; 
        
     }
     
     /**
        * Reads the content of the file and returns it as a string.
        * 
        * @param filepath the path of the file to be read
        * @return the content of the file as a string
        * @throws IOException if there is an I/O error while reading the file
     */
     
     
    protected String getFileContent(String filepath) throws IOException {
    
        StringBuilder contentBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(filepath)) {
            int c;
            while ((c = reader.read()) != -1) {
                contentBuilder.append((char) c);
            }
        } catch (IOException exc) {
            System.out.println(exc);
        } finally {
            System.out.println();
        }

        return contentBuilder.toString();
    }
    
    /**
        * Counts the number of vowels in the specified text.
        * 
        * @param text the text in which to count vowels
        * @return the number of vowels in the text
    */
     
     protected int countVowels(String text) {
        for (char c : text.toCharArray()) {
            if (VOWELS.contains(c)) {
                NumVowels++;
            }
        }
         return NumVowels;
    }
      
    /**
        * Counts the number of vowels in the specified text.
        * 
        * @param text the text in which to count consonants
        * @return the number of consonants in the text
    */
     
     protected int countConsonants(String text) {
        for (char c : text.toCharArray()) {
            if (!Character.isWhitespace(c) && !VOWELS.contains(c)) {
               NumConsonants++;
            }
        }
         return NumConsonants;
    }
    
 
    /**
    * Displays the result of the file processing, showing the file path, the number of vowels,
    * and the number of consonants.
     * 
    */
     

    protected void showResult() {
        fileName = filepath.getFileName().toString();  

        System.out.println("Document " + fileName + "contains:"  );
        System.out.println("Vowels: " + NumVowels);
        System.out.println("Consonants: " + NumConsonants);
    }
    
}
 

