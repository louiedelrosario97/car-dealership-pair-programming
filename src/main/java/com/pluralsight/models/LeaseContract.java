package com.pluralsight.models;

public class LeaseContract extends Contract {


    //constructors
    public LeaseContract(String date, String name, String email, Vehicle vehicle){

        super(date, name, email, vehicle);
    }

    //Methods
    public double getExpectedEndingValue(){
        double price = getVehicle().getPrice();
        double endingPrice;

        endingPrice =  price * .5;
        return endingPrice;
    }

    public double leaseFee() {
        double price = getVehicle().getPrice();
        double leaseFee;

        leaseFee =  price * .07;
        return leaseFee;

    }





    @Override
    public void getTotalPrice(){

    }
    @Override
    public void getMonthlyPayment(){

    }
}





