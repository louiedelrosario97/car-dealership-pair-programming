package com.pluralsight.io;

import com.pluralsight.models.Dealership;
import com.pluralsight.models.Vehicle;

import java.io.*;
import java.util.ArrayList;
// DealershipFileManager will be responsible for reading the dealership file. It will
//parse the data, and create a Dealership object, and create each Vehicle to be
//added to the Dealership's inventory. It will also be responsible for saving the
//dealership and it's vehicles in the file in the same pipe-delimited format
public class DealershipFileManager
{
    public static Dealership loadDealership() throws IOException
    {
        Dealership dealership;

        FileReader fileReader = new FileReader("data/inventory.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        String[] parts = line.split("\\|");
        String name = parts[0];
        String address = parts[1];
        String phone = parts[2];

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while((line = bufferedReader.readLine()) != null)
        {
            Vehicle vehicle = getVehicle(line);

            vehicles.add(vehicle);
        }

        dealership = new Dealership(name, address, phone, vehicles);

        return dealership;
    }

    public static void addVehicle(Vehicle vehicle)
    {

        try(FileWriter fileWriter = new FileWriter("data/inventory.csv",true);
            PrintWriter writer = new PrintWriter(fileWriter))
        {
            writer.printf("%d|%d|%s|%s|%s|%s|%d|%f.2\n",
                    vehicle.getVin(),
                    vehicle.getYear(),
                    vehicle.getMake(),
                    vehicle.getModel(),
                    vehicle.getVehicleType(),
                    vehicle.getColor(),
                    vehicle.getOdometer(),
                    vehicle.getPrice()
                    );
        }
        catch(IOException e)
        {
            //swallow
        }
    }

    private static Vehicle getVehicle(String line)
    {
        String[] columns = line.split("\\|");

        int vin =  Integer.parseInt(columns[0]);
        int year = Integer.parseInt(columns[1]);
        String make = columns[2];
        String model = columns[3];
        String vehicleType = columns[4];
        String color = columns[5];
        int odometer = Integer.parseInt(columns[6]);
        double price = Double.parseDouble(columns[7]);

        return new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
    }

    public static void saveDealership(Dealership dealership)
    {


        try(FileWriter fileWriter = new FileWriter("data/inventory.csv");
            PrintWriter writer = new PrintWriter(fileWriter))
        {
            writer.printf("%s|%s|%s\n",
                    dealership.getName(),
                    dealership.getAddress(),
                    dealership.getPhone());

            for(Vehicle vehicle : dealership.getAllVehicles())
            {
                writer.printf("%d|%d|%s|%s|%s|%s|%d|%.2f\n",
                        vehicle.getVin(),
                        vehicle.getYear(),
                        vehicle.getMake(),
                        vehicle.getModel(),
                        vehicle.getVehicleType(),
                        vehicle.getColor(),
                        vehicle.getOdometer(),
                        vehicle.getPrice()
                );
            }
        }
        catch(IOException e)
        {
            //swallow
        }
    }
}
