
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

    public static int findRun(String someString, int i, int counter, int biggestRun, char lastChar) {

        int i = 0;
        int counter = 0;
        int biggestRun = counter;
        String currentChar = "";

        

    }

    public static void main(String[] args) throws IOException {
        // read the file
        Path someFile = Path.of("C:\\Users\\s278552\\Everything\\Assignments\\Assign-02-Java\\string.txt");
        String someString = Files.readString(someFile);

        System.out.println(someString);

        // String strArray[] = someString.split("\r?\n");

        // System.out.println(strArray[0]);
        // System.out.println(strArray[1]);

    }
}
