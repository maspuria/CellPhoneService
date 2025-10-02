package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();

        cellPhone1.setSerialNumber("100000");
        cellPhone1.setModel("iPhoneX");
        cellPhone1.setCarrier("AT&T");
        cellPhone1.setPhoneNumber("800-555-5555");
        cellPhone1.setOwner("Dana Wyatt");
        cellPhone1.display();


    }
}
