package week4.lab7;

/**
 * Created by Chris Pilcher on 7/11/2017.
 */

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class FileStatistics2 {
    public static void main(String[]args){

        // This is to make javac not yell at us when we try to compile it with the variable assignments inside
        // the try block.
        Path text = null;
        Path docx = null;

        try{
            // Get the file names from the input. Note: You have to put the absolute file paths into the command line.
            text = Paths.get(args[0]);
            docx = Paths.get(args[1]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Usage: java FileStatistics2 <your text file> <your docx file>\nPaths must be absolute.");
            System.exit(1);
        }

        // Same as above.
        BasicFileAttributes textAttributes = null;
        BasicFileAttributes docxAttributes = null;

        try{
            // Try to read the attributes from the files.
            textAttributes = Files.readAttributes(text, BasicFileAttributes.class);
            docxAttributes = Files.readAttributes(docx, BasicFileAttributes.class);
        } catch(IOException ex){
            System.out.println("There was an IO error. This likely means you entered incorrect file paths.");
            System.exit(1);
        }

        // Get the sizes of the files.
        long textSize = textAttributes.size();
        long docxSize = docxAttributes.size();

        System.out.printf("The sizes of the files are\n" +
                          "Text\t|Docx\n" +
                          "----\t|----\n" +
                          "%d\t|%d\n", textSize, docxSize);

        // Get the greatest common divisor, so that we can make the most simplified ratio possible.
        long commonDivisor = gcd(textSize, docxSize);

        System.out.printf("The simplified ratio between the two files (text:docx) is: %d:%d\n",
                          textSize / commonDivisor,
                          docxSize / commonDivisor);


    }

    // This is just to get the greatest common divisor, so that we can get a nice ratio.
    private static long gcd(long a, long b){
        long temp;
        while (b > 0){
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
