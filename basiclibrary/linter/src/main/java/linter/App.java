/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {


        Path gatesFile =  Paths.get("src/main/resources/gate.js");
        missingSemicolon(gatesFile);

    }

    public static String missingSemicolon(Path filePath){
        System.out.println(new App().getGreeting());
        int line = 1;
        String errorMessage = "";
        try {
            Scanner gatesFileScanner = new Scanner(new File(filePath.toUri()));
            while(gatesFileScanner.hasNextLine()) {
                String nextLine = gatesFileScanner.nextLine();
                if(!nextLine.startsWith("//") && !nextLine.endsWith(";") &&
                        !nextLine.endsWith("{") && !nextLine.endsWith("}") &&
                !nextLine.isEmpty() && !nextLine.contains("if") &&
                        !nextLine.contains("else")) {
                    errorMessage += String.format("Line %d: Missing semicolon.\n", line);
                }
                line++;

            }
            System.out.println("error message\n" + errorMessage);

        }catch(FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("couldn't find the file");

        }
        return errorMessage;
    }
}
