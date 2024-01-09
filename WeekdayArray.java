package Pradeep;

import java.util.Scanner;

public class WeekdayArray {
    public static void main(String[] args) {

                String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the day position (0-6): ");
                try {
                    int dayPosition = scanner.nextInt();

                    if (dayPosition >= 0 && dayPosition <= 6) {
                        String dayName = weekdays[dayPosition];
                        System.out.println("The day is: " + dayName);
                    } else {
                        System.out.println("Invalid day position. Please enter a value between 0 and 6.");
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of bounds. Please enter a day position between 0 and 6.");
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a valid integer.");

    }
}}
