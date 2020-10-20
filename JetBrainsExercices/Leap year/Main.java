import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long a, y, c;
        Scanner sc = new Scanner(System.in);
        y = sc.nextLong();
        if (y != 0) {
            a = (y % 400 == 0) ? (c = 1) : ((y % 100 == 0) ? (c = 0) : ((y % 4 == 0) ? (c = 1) : (c = 0)));
            if (a == 1) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        } else {
            System.out.println("year zero does not exist ");
        }
    }
}