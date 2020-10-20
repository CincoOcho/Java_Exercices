public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str0 = scanner.nextLine();
        String str1 = scanner.nextLine();
        String str2=str1.replace(" ", "");
        System.out.println("STR1=" + str0 + ", STR2=" + str1 + ", STR3 changed=" + str2);
        System.out.println(str0.equals(str2));
    }

}