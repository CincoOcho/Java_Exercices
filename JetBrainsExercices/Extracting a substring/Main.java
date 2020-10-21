import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int a = scn.nextInt();
        int b = scn.nextInt();
        int i = 0;
        boolean passBasic = a >= 0 && b >= 0;

        int rangeLimit = str.length();
        if (passBasic && a < rangeLimit && b <= rangeLimit) {
            for (i = a; i <= b; i++) {
                System.out.print(str.charAt(i));
            }
        } else {
            System.out.println("ERROR");
        }

    }
}