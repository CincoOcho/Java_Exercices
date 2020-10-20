import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean outBool = input < 10 && input > 0;
        System.out.println(outBool);
    }
}