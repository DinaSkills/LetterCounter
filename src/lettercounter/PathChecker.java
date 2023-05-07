
package lettercounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


/**
 * 
 * @author Dina
 */


public class PathChecker {
    private Path path;
    private FileTxt txt;
    private FileXml xml;
    
    /**
     * Constructs a PathChecker object with the specified file path.
     * @param path the path of the file to be processed
     * @throws IOException if there is an I/O error while reading the file
     */
    
    public PathChecker(Path path) throws IOException {
        this.path = path;
        checkFileExtension(path);
        
    } 
    
    /**
     * Checks if path is empty.
     * @param path the path of the file to be processed
     * @throws IOException if there is an I/O error while reading the file
     */

    private void isEmptyPath(Path path) throws IOException {
        if (path.toString().isEmpty()) {
            throw new IOException("The specified path cannot be empty. Enter file path.");
        }
    }
    
    /**
     * Checks if path is directory.
     * @param path the path of the file to be processed
     * @throws IOException if there is an I/O error while reading the file
     */
    
    private void isDirectory(Path path) throws IOException {
        if (Files.isDirectory(path)) {
            throw new IOException("The specified path is a directory. Enter file path.");
        }
    }
          
    /**
     * Checks path extension for .xml or .txt file and creates instance of object according to extensions of the path,.
     * @param path  the path of the file to be processed
     * @throws IOException if there is an I/O error while reading the file
     */
    private void checkFileExtension(Path path) throws IOException {
           isEmptyPath(path); 
           isDirectory(path);
        String fileName = path.getFileName().toString();
       
        if (fileName.endsWith(".txt")) {
            this.txt = new FileTxt(path);
        } else if (fileName.endsWith(".xml")) {
            this.xml = new FileXml(path);
        } else {
            throw new IOException("The specified path is not a file path or is not a .txt or .xml file.");
        } 
        
     
    }  
}






        
         
      


