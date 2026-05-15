package com.pluralsight.models;

public class SalesContract extends Contract {
    // variable
    private final double salesTaxAmount = .05;
    private final double recordingFee = 100.00;
    private boolean finance;

    //constructor
    public SalesContract(String date, String name, String email, Vehicle vehicle, boolean finance)
    {

        super(date,name,email,vehicle);

        this.finance = finance;

    }

    // getter and setter
    public double getSalesTaxAmount() { return salesTaxAmount; }
    public double getRecordingFee() { return recordingFee; }

    public boolean isFinance() { return finance; }
    public void setFinance(boolean finance) { this.finance = finance; }

    //methods for processing fee
    public double getProcessingFee()
    {
    if (getVehicle().getPrice() < 10000) { return 295.00; }
    else                                 { return 495.00; }
    }




    @Override
    public void getTotalPrice(){

    }
    @Override
    public void getMonthlyPayment() {
        double APR = .0425;
        double months = 48.00;
        double price = getVehicle().getPrice();
        if (price < 10000)
        {
            APR = .0525;
            months = 24.00;
        }

        price
    }
}

