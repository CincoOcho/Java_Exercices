package Main;
// - - - @author JL <CincoOcho.GitHub> - - - //

import java.util.Scanner;

public class StringSerch {

    public static boolean OK = true;

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void StringSerch(String strInput) {
        StringBuilder sb = new StringBuilder(strInput);
        sb.reverse();

        String strArray[] = strInput.split("");
        String strReverse = reverseString(strInput);
        String strReverseCheck[] = strReverse.split("");
        
            System.out.println("Phrase : "+strInput);
            System.out.println("Phrase (reverse): "+strReverse);
            System.out.println("Checking . . .");
            
        

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(strReverseCheck[i])) {

                System.out.println("A1 - POSITION # " + i + " - CHAR - > " + strArray[i]);
                System.out.println("A2 - POSITION # " + i + " - CHAR - > " + strReverseCheck[i]);
                System.out.println("- - - - - - - - - - - - - - - - - ");

            } else if (!strArray[i].equals(strReverseCheck[i])) {
                System.out.println("- - - - - E R R O R - - - - - - - ");
                System.out.println("A1 - POSITION # " + i + " - CHAR - > " + strArray[i]);
                System.out.println("A2 - POSITION # " + i + " - CHAR - > " + strReverseCheck[i]);
                System.out.println("- - - - - - - - - - - - - - - - - ");
                OK = false;
            }

        }
        System.out.println("| | | | | | | | | | | | | | | |");
        System.out.println("\tR E S U L T ! !");
        System.out.println("\tPalindrome ! ?  = " + OK);
        System.out.println("| | | | | | | | | | | | | | | |");

    }

    public static void main(String[] args) {

        String inputString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a phrase to check...");
        inputString = sc.nextLine();
        inputString = inputString.replaceAll("\\s+", "");
        reverseString(inputString);
        StringSerch(inputString);

    }
}
