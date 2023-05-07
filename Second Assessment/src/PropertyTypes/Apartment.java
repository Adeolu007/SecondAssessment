package PropertyTypes;

import BaseClass.Property;
import Enums.OccupiedStatus;




public class Apartment extends Property {
    private int floorNumber;


    public Apartment(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, int floorNumber) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public double rentalIncome() {
        if (isOccupiedStatus()){
            return getNumberOfBedrooms() * getRentPerMonth();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "propertyCode : " + super.getPropertyCode() +
                "\nlocation : " + super.getLocation() + '\'' +
                "\nnumberOfBedrooms : " + super.getNumberOfBedrooms() +
                "\nnumberOfBathrooms : " + super.getNumberOfBathrooms() +
                "\nrentPerMonth : " + super.getRentPerMonth()+
                "\nfloorNumber : " + getFloorNumber() +
                "\noccupiedStatus : " + super.isOccupiedStatus() +
                "}\n\n";
    }
}