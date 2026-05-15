package com.pluralsight.models;

public abstract class Contract
{
    // Declared variables
    private String date;
    private String name;
    private String email;
    private String vehicleSold;

    // Constructor
    public Contract(String date, String name, String email, String vehicleSold)
    {
        this.date = date;
        this.name = name;
        this.email = email;
        this.vehicleSold = vehicleSold;
    }

    // Getters
    public String getDate() { return date; }
    public String getName() { return name;}
    public String getEmail() { return email; }
    public String getVehicleSold() { return vehicleSold; }

    // Setters
    public void setDate(String date) { this.date = date; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setVehicleSold(String vehicleSold) { this.vehicleSold = vehicleSold; }

    // Abstract Methods
    public abstract void getTotalPrice();

    public abstract void getMonthlyPayment();
}

