import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = 0;
        int counter = 0;
        if ((h <= 100 && h >= 0) && (a <= 100 && a >= 0) && (b <= 100 && b >= 0)) {
            if (h > b && a > b) {
                while (counter <= h) {
                    counter += a;
                    if (counter >= h) {
                        days++;
                        break;
                    } else {
                        counter -= b;
                    }
                    days++;
                }
                System.out.println(days);
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}