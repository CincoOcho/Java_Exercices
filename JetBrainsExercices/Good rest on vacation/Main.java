import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int durationDays = scanner.nextInt();
        int totalFoodCost = scanner.nextInt();
        int oneWayFly = scanner.nextInt();
        int costNightHotel = scanner.nextInt();
        int totalCost = 0;
        totalFoodCost *= durationDays;
        costNightHotel *= durationDays - 1;
        totalCost = totalFoodCost + (oneWayFly * 2) + costNightHotel;
        System.out.println(totalCost);
    }
}