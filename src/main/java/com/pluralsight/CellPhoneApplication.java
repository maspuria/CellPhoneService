package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        cellPhone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        cellPhone1.setModel(scanner.nextLine().trim());

        System.out.print("Who is the carrier? ");
        cellPhone1.setCarrier(scanner.nextLine().trim());

        System.out.print("What is the phone number? ");
        cellPhone1.setPhoneNumber(scanner.nextLine().trim());

        System.out.print("Who is the owner of the phone? ");
        cellPhone1.setOwner(scanner.nextLine().trim());

        cellPhone1.display();
        System.out.println(cellPhone1);

        cellPhone1.dial("855-555-2222\n");

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(100000);
        cellPhone2.setModel("iPhoneX");
        cellPhone2.setCarrier("AT&T");
        cellPhone2.setPhoneNumber("800-555-5555");
        cellPhone2.setOwner("Dana Wyatt");

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());

        cellPhone2.dial(cellPhone1.getPhoneNumber());

    }
    public static void display(CellPhone phone){
        System.out.println("Serial number: " +  phone.getSerialNumber());
        System.out.println("Model: " +  phone.getModel());
        System.out.println("Carrier: " +  phone.getCarrier());
        System.out.println("Phone number: " +  phone.getPhoneNumber());
        System.out.println("Owner: " +  phone.getOwner());
        System.out.println();
    }
}
