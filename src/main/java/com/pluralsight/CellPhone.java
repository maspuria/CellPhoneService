package com.pluralsight;

public class CellPhone {
//  Field Members
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
//  Constructor
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }
//  Getters and Setters
    public int getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    //    Methods
    public void display() {
        System.out.println("Serial Number = " + this.getSerialNumber() + ", Model = " + this.getModel()
                + ", Carrier = " + this.getCarrier() + ", Phone Number = " + this.getPhoneNumber() + ", Owner = " + this.getOwner());
    }
//  OR
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CellPhone{");
        sb.append("serialNumber = ").append(serialNumber);
        sb.append(", model = '").append(model).append('\'');
        sb.append(", carrier = '").append(carrier).append('\'');
        sb.append(", phoneNumber = '").append(phoneNumber).append('\'');
        sb.append(", owner = '").append(owner).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void dial(String phoneNumber) {
        System.out.printf("%s's phone is calling %s", this.getOwner(), phoneNumber);
    }

}
