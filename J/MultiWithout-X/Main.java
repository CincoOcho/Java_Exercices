import java.util.Scanner;
public class Main {
	    static void InputNumbers() {

        Scanner scanner = new Scanner(System.in);
        int num, multi;
        System.out.println("Please give me a number to multiplication :");
        num = scanner.nextInt();                
        System.out.println("Multiplication times? ");
        multi = scanner.nextInt();              
        Multi(num, multi);
    }

    static void Multi(int a, int b) {
		int sum=0;
        int[] result = new int[b];
        for (int i = 0; i < b; i++) {
			result[i]=a+sum;
			sum+=a;
        }
		 for (int i = 0; i < b; i++) {
            System.out.println("Result " + a + " x " + (i + 1) + " = " + result[i]);
        }

    }
	
    public static void main(String[] args) {
        InputNumbers();

		}
}