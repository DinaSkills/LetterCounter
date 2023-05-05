
package lettercounter;


import java.io.IOException;
import java.nio.file.Path;

/**
 *
 * @author Dina
 */
public class FileTxt extends FileProcessor {
    
     public FileTxt(Path filepath) throws IOException {
        super(filepath);
        processFile();
    }
     
      /**
        * This method processes txt files and returns number of vowels and consonants 
          and displaying results. 
        * 
        * @param filepath the path of the file to be read
        * @return displays number of vowels and consonants in a txt file

        * @throws IOException if there is an I/O error while reading the file
     */

    private void processFile() throws IOException {
        String fileContent = getFileContent(this.filepath.toString());
         countVowels(fileContent);
         countConsonants(fileContent);
         showResult();
    } 
    
}
