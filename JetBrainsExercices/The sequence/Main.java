import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int[] inputs = new int[limit];
        int largest = inputs[0];
        int auxInput;
        int i = 0;

        while (limit != i) {
            auxInput = scanner.nextInt();
            if (auxInput < 30_000 && auxInput > 0) {
                if (auxInput % 4 == 0) {
                    inputs[i] = auxInput;
                    if (inputs[i] > largest) {
                        largest = inputs[i];
                    }

                }
            } else {
                System.out.println("Num not valid");
            }
            i++;
        }
        System.out.println(largest);
    }
}