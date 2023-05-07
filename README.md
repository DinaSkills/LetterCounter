# LetterCounterLetterCounter Java Project Documentation
Introduction
The LetterCounter project is a Java application that reads a file and counts the number of vowels and consonants in the file. The application supports two file formats, TXT and XML.

## Usage 
To use the LetterCounter application, follow these steps:

+ Download LatterCounter.zip project or pull request from https://github.com/DinaSkills/Java-project.git
+ Unzip project in desired destination
+ Open the command prompt or terminal.
+ Navigate to the directory enter following command: -jar  dist/LetterCounter.jar 
+ Or navigate to the directory where the LetterCounter.jar file is located.
+ Enter the following command: java -jar LetterCounter.jar 
+ Enter the path of a file that you want to count the vowels and consonants for.

## Features
+ The LetterCounter application includes the following features:
+ Supports both TXT and XML file formats.
+ Counts the number of vowels and consonants in the file.
+ Displays the results in the console

## Javadoc
   Navigate to the directory where the dist/javadoc/index.html file is located.
      
## Classes
The LetterCounter project includes the following classes:

PathChecker.java
Checks path if it is empty or if it is directory and creates an instance of either the FileTxt or FileXml class depending on the file format.

FileProcessor.java
This class is responsible for reading the contents of a file and counting the number of vowels and consonants.

FileTxt.java
This class extends the FileProcessor class and is responsible for handling TXT files.

FileXml.java
This class extends the FileProcessor class and is responsible for handling XML files.

LetterCounter.java
This class is the main entry point for the application. It accepts a file path as a command-line argument.

## Dependencies
The LetterCounter project depends on the following libraries:

+ javax.xml.parsers (for parsing XML files)
+ org.w3c.dom (for working with XML DOM)
+ java.nio (for working with file paths and directories)
+ Java.util (working with user inputs, scanner)
+ Org.xml.sax (parsing mistakes in XML files)
+ Java.io (working with files)


## Conclusion
The LetterCounter project is a simple Java application that demonstrates how to read and process files. The application can be used to count the number of vowels and consonants in TXT and XML files.
