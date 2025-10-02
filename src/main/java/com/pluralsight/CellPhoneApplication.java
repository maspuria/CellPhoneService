package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();

        cellPhone1.setSerialNumber("100000");
        cellPhone1.setModel("iPhoneX");
        cellPhone1.setCarrier("AT&T");
        cellPhone1.setPhoneNumber("800-555-5555");
        cellPhone1.setOwner("Dana Wyatt");
        cellPhone1.display();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the serial number?");
        String serialNumber = scanner.nextLine().trim();

        System.out.println("What model is the phone?");
        String model = scanner.nextLine().trim();

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine().trim();

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine().trim();

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine().trim();





    }
}
