import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String newString = input.toLowerCase();
        boolean startsWith = newString.startsWith("j");
        System.out.println(startsWith);
    }
}