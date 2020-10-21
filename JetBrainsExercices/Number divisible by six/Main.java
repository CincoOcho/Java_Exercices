import java.util.Scanner;

public class Main {

    public static int sum = 0;

    static void divisibleSix(int x) {
        if (x % 6 == 0) {
            sum += x;
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int limit = scn.nextInt();

        for (int i = 0; i < limit; i++) {
            int input = scn.nextInt();
            divisibleSix(input);
        }
        System.out.println(sum);
    }

}