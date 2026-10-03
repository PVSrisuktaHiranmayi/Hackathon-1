//HOUSEHOLD WATER-USAGE & BILLING MONITOR:

import java.util.Scanner;
public class HouseholdWaterUsageBillingMonitor{
    static int calculateTotal(int morningUsage, int eveningUsage){
        return morningUsage + eveningUsage;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of members in the family: ");
        int number = sc.nextInt();
        System.out.println("Enter the amount of water consumed in litres: ");
        double waterConsumed = sc.nextDouble();
        System.out.println("Enter the house number: ");
        int houseNumber = sc.nextInt();
        System.out.println("Enter water usage status(High/Low/Medium): ");
        String waterUsageStatus = sc.next();
        System.out.println("Enter the morning water usage in litres: ");
        int morningUsage = sc.nextInt();
        System.out.println("Enter the evening water usage in litres: ");
        int eveningUsage = sc.nextInt();
        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println();
        System.out.println("Family Members: " + number);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Water Usage Status: " + waterUsageStatus);
        System.out.println("Total Water Usage: " + totalUsage + " litres");

        if(waterConsumed < 500){
            System.out.println("The bill is Rs.100");
        }
        else{
            System.out.println("The bill is Rs.200");
        }
    }
}