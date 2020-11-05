import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int square ;
        int aument = 1;
        do {
            square = aument * aument;
            if (square <= input) {
                System.out.println(square);
            }
            aument++;

        } while (square <= input);
    }

}