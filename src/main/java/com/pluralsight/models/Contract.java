package com.pluralsight.models;

public abstract class Contract
{
    // Declared variables
    private String date;
    private String name;
    private String email;
    private Vehicle vehicle;



    // Constructor
    public Contract(String date, String name, String email, Vehicle vehicle)
    {
        this.date = date;
        this.name = name;
        this.email = email;
        this.vehicle = vehicle;
    }

    protected Contract() {
    }

    // Getters
    public String getDate() { return date; }
    public String getName() { return name;}
    public String getEmail() { return email; }
    public Vehicle getVehicle() { return vehicle; }

    // Setters
    public void setDate(String date) { this.date = date; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setVehicle(Vehicle vehicleSold) { this.vehicle = vehicleSold; }

    // Abstract Methods
    public abstract void getTotalPrice();

    public abstract void getMonthlyPayment();
}

