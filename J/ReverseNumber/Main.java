public class  Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a number (type INT)");
        int i = scan.nextInt() ;
        int rev = 0;
        System.out.println("Original: " + i);
        while (i != 0) {
            int digit = i % 10;
            rev = rev * 10 + digit;
            i /= 10;
        }
        System.out.println("Reversed: " + rev);

    }
}