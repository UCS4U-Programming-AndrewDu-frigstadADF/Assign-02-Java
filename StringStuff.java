
/**
 * doing strign stuff with recursions
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since 2022-04-19
**/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StringStuff {

    public static int findRun(char[] someChars) {

        int counter = 0;
        int biggestRun = counter;
        String currentChar = "";
        List<Integer> run = new ArrayList<Integer>();
        char[] newCharArray = new char[someChars.length + 1];

        // making a new array that is 1 element longer
        for (int j = 0; j < someChars.length; j++) {

            newCharArray[j] = someChars[j];

        }

        // adding an extra character to the new array so that when it gets checked it does all of the elements and does not leave out the last one.
        if (someChars[-1] == 'a') {
            
            newCharArray[-1] = ';';
        
        } else {

            newCharArray[-1] = 'a';

        }

        Arrays.sort(someChars);

        for (int charIndex = 1; charIndex < someChars.length; charIndex = charIndex + 1) {

            if (someChars[charIndex] != someChars[charIndex - 1]) {

                if (counter > biggestRun) {

                    biggestRun = counter;



                }

            }

        }

    }

    public static void main(String[] args) throws IOException {
        // read the file
        Path someFile = Path.of("C:\\Users\\s278552\\Everything\\Assignments\\Assign-02-Java\\string.txt");
        String someString = Files.readString(someFile);

        System.out.println(someString);

        char[] someChars = someString.toCharArray();

    }
}
