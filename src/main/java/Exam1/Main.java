package Exam1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Question 2
    public static void printFullName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    public static int getPrice(){
        int randomInt = (int) (Math.random() * 15) + 5;
        int num = randomInt;
        if (5 <= num && num <= 15){
            System.out.println(randomInt);
        }

        return num;
    }

    public static void printSizes(char[] sizes){
        Arrays.toString(sizes);
        System.out.println(sizes);
    }

    public static void printOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Burger-Joint. Is it true or false that your order will be to go?");
        boolean orderToGo = scanner.nextBoolean();
        System.out.println("What type of burger do you want today? Cheese, ham or turkey?");
        String burgerType = scanner.nextLine();
        System.out.println("Please enter a tip of 0%, 5%,10%, 15% or 20% tip!");
        int orderTip = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is the name for your order?");
        String nameForOrder = scanner.nextLine();
        int total = "Okay greatYour total is" + get
        System.out.println("Okay great. Your to-go status is " + orderToGo + ", You are ordering a " + burgerType+ ",");


    }


    public static void main(String[] args) {
        //Question 1
        String firstName = "Alexandria";
        String lastName = "Paul";
        char[] sizes = {'S', 'M', 'L'};
        final String EXPIRATIONDATE = "Sept 12 2024";

        //Question 2
        printFullName(firstName, lastName);
        getPrice();
        printSizes(sizes);









    }

}
