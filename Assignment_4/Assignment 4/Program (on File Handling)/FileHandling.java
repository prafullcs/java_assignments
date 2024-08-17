package assignment4;   

//program7

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileHandling <source_file> <destination_file>");
            return;
        }
        
        String sourceFile = args[0];
        String destinationFile = args[1];

 // a) Count the number of characters, words, and lines in the source file

        countCharactersWordsLines(sourceFile);

// b) Search for a given word in the source file

        searchWord(sourceFile, "word_to_search");

// c) Copy contents of the source into the destination file

        copyFile(sourceFile, destinationFile);
    }

// Method to count the number of characters, words, and lines in a file

    public static void countCharactersWordsLines(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;
            String line;

            while ((line = reader.readLine()) != null) {
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                lineCount++;
            }

            System.out.println("Character count: " + charCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Line count: " + lineCount);

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

// Method to search for a word in a file

    public static void searchWord(String fileName, String word) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    found = true;
                    break;
                }
            }

            if (found)
                System.out.println("The word '" + word + "' was found in the file.");
            else
                System.out.println("The word '" + word + "' was not found in the file.");

            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

// Method to copy contents of source file to destination file

    public static void copyFile(String sourceFileName, String destinationFileName) {
        try {
            FileInputStream fis = new FileInputStream(sourceFileName);
            FileOutputStream fos = new FileOutputStream(destinationFileName);
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error copying the file: " + e.getMessage());
        }
    }
}
