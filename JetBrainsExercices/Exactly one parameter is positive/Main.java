import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean outTRUE;
        if (a > 0 && b <= 0 && c <= 0) {
            outTRUE = true;
        } else if (a <= 0 && b > 0 && c <= 0) {
            outTRUE = true;
        } else {
            outTRUE = a <= 0 && b <= 0 && c > 0;
        }
        System.out.println(outTRUE);
    }
}