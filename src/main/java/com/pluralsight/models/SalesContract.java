package com.pluralsight.models;

public class SalesContract extends Contract {
    // variable
    private final double salesTaxAmount = .05;
    private final double recordingFee = 100.00;
    private boolean finance;



    //constructor
    public SalesContract(String date, String name, String email, String vehicleSold,boolean finance){

        super(date,name,email,vehicleSold);

        this.finance = finance;

    }

    // getter and setter
    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    //methods for processing fee

    public double getProcessingFee(){


    }





    @Override
    public void getTotalPrice(){

    }
    @Override
    public void getMonthlyPayment(){

    }
}

