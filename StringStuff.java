
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

        // variables
        int counter = 0;
        int biggestRun = counter;
        String currentChar = "";
        List<Integer> run = new ArrayList<Integer>();
        char[] newCharArray = new char[someChars.length + 1];

        // making a new array that is 1 element longer
        for (int j = 0; j < someChars.length; j++) {

            newCharArray[j] = someChars[j];

        }

        // adding an extra character to the new array so that when it gets checked it
        // does all of the elements and does not leave out the last one.
        if (someChars[someChars.length - 1] == 'a') {

            newCharArray[newCharArray.length - 1] = ';';

        } else {

            newCharArray[newCharArray.length - 1] = 'a';

        }

        for (int charIndex = 1; charIndex < newCharArray.length; charIndex = charIndex + 1) {

            // if the previous index does not math the current one then...
            if (newCharArray[charIndex] != newCharArray[charIndex - 1]) {

                // if the new run of letters is more than the biggest then make it equal the biggest
                if (counter > biggestRun) {

                    biggestRun = counter;

                }

                counter = 1;

                // if the new character is still the biggest, make it bigger
            } else {
                counter = counter + 1;
            }
        }
        return biggestRun;

    }

    public static void main(String[] args) throws IOException {
        // read the file
        Path someFile = Path.of("C:\\Users\\s278552\\Everything\\Assignments\\Assign-02-Java\\string.txt");
        String someString = Files.readString(someFile);

        // printing the string
        System.out.println(someString);

        // converting the string to an array of characters
        char[] someChars = someString.toCharArray();

        // call and print the biggest run
        int run = findRun(someChars);

        System.out.println(run);

    }
}
