package com.codecool.classstructerattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        client.name = scanner.nextLine();

        System.out.println("Please enter your year of birth: ");
        client.year = scanner.nextInt();

        client.address = scanner.nextLine();
        System.out.println("Please enter your address: ");
        client.address = scanner.nextLine();

        System.out.println("Your details are: ");
        System.out.println("Name: " + client.name);
        System.out.println("Year: " + client.year);
        System.out.println("Address: " + client.address);
    }
}
