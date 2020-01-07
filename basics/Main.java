import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Test method
        System.out.println("Main method is working!");

        // pluralize
        System.out.println(pluralize("dog", 2));
        System.out.println(pluralize("cat", 1));

        // flipping coins
        System.out.println(flipNHeads(6));

        // command line clock 
        System.out.println(clock());

    }

    //pluralize method
    public static String pluralize (String word, int number) {
        String pluralWord = "";
        if(number > 1) {
            pluralWord = word + "s";
        } else pluralWord = word;

        return pluralWord;
    }

    //flipping coin method
    public static String flipNHeads (int flipCount) {
        int flipCounter = 0;
        int headsCounter = 0;
        String flipResult = "";
        while (flipCount > flipCounter) {
            double randomNum = Math.random();
            if (randomNum >= 0.5) {
                flipResult = "heads";
                headsCounter++;
                System.out.println(flipResult);
            } else {
                flipResult = "tails";
                System.out.println(flipResult);
            }
            flipCounter++;
        }
        return "It took " + flipCount + " flips " + "to flip " + headsCounter + " head in a row.";
    }

    //command line clock
    public static String clock() {
        int pastSecond = 100;
        for(; ; ){
            LocalDateTime now = LocalDateTime.now();
            int secondNow = now.getSecond();
            if(pastSecond != secondNow){
                String timeNow = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(timeNow);
                pastSecond = secondNow;
            }
        }
    }
}