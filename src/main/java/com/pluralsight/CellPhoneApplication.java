package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        cellPhone1.setSerialNumber("100000");
        cellPhone1.setModel("iPhoneX");
        cellPhone1.setCarrier("AT&T");
        cellPhone1.setPhoneNumber("800-555-5555");
        cellPhone1.setOwner("Dana Wyatt");
        cellPhone1.display();

        CellPhone cellPhone2 = new CellPhone();

        System.out.println("What is the serial number?");
        cellPhone2.setSerialNumber(scanner.nextLine().trim());

        System.out.println("What model is the phone?");
        cellPhone2.setModel(scanner.nextLine().trim());

        System.out.println("Who is the carrier?");
        cellPhone2.setCarrier(scanner.nextLine().trim());

        System.out.println("What is the phone number?");
        cellPhone2.setPhoneNumber(scanner.nextLine().trim());

        System.out.println("Who is the owner of the phone?");
        cellPhone2.setPhoneNumber(scanner.nextLine().trim());

        cellPhone2.display();


    }
}
