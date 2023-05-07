package PropertyTypes;

import BaseClass.Property;
import Enums.OccupiedStatus;



public class Condo extends Property {
    private int numberOfFloors;
    private String amenities;


    public Condo(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, int numberOfFloors,String amenities) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.numberOfFloors = numberOfFloors;
        this.amenities = amenities;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    @Override
    public double rentalIncome() {
        if (isOccupiedStatus()) {
            return getNumberOfFloors() * getNumberOfBedrooms() * getRentPerMonth();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Condo{" +
                "propertyCode : " + super.getPropertyCode() +
                "\nlocation : " + super.getLocation() + '\'' +
                "\nnumberOfBedrooms : " + super.getNumberOfBedrooms() +
                "\nnumberOfBathrooms : " + super.getNumberOfBathrooms() +
                "\nrentPerMonth : " + super.getRentPerMonth()+
                "\nnumberOfFLoors : " + getNumberOfFloors() +
                "\nAmenities : " + getAmenities() +
                "\noccupiedStatus : " + super.isOccupiedStatus() +
                "}\n\n";
    }
}