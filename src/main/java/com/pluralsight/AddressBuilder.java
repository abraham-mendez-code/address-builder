package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        // Declare and initialize the string builder object to store full name and, billing and shipping address
        StringBuilder buildAddress = new StringBuilder();

        // this stores user input from system using scanner object
        Scanner userInput = new Scanner(System.in);

        // this prints out message requesting information from the user and their full name
        System.out.println("Please provide the following information:");
        System.out.print("Full name: ");

        // this store the response for the full name request in string builder
        buildAddress.append(userInput.nextLine()).append("\n\nBilling Address:\n");

        // print out an extra blank line after the input for formating and request next input
        System.out.print("\nBilling Street: ");
        buildAddress.append(userInput.nextLine());
        //add new line for formating
        buildAddress.append("\n");

        // repeat print and store for all remaining billing inputs
        System.out.print("Billing City: ");
        buildAddress.append(userInput.nextLine());
        // add comma after city for formating
        buildAddress.append(", ");

        System.out.print("Billing State: ");
        // add input and an empty space after to buildAddress for formating
        buildAddress.append(userInput.nextLine()).append(" ");

        // this prints out a message and store it then appends a string
        System.out.print("Billing Zip: ");
        buildAddress.append(userInput.nextLine()).append("\n\nShipping Address:\n");

        // this prints outs a messages for shipping information using System.out.print then stores it and appends a new line
        System.out.print("\nShipping Street: ");
        buildAddress.append(userInput.nextLine()).append("\n");

        // print out message, store input in buildAddress
        System.out.print("Shipping City: ");
        buildAddress.append(userInput.nextLine()).append(", ");

        System.out.print("Shipping State: ");
        buildAddress.append(userInput.nextLine()).append(" ");

        System.out.print("Shipping Zip: ");
        buildAddress.append(userInput.nextLine()).append(" ");

        System.out.print(buildAddress);

    }

}
