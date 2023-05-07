package PropertyTypes;

import BaseClass.Property;
import Enums.OccupiedStatus;

public class House extends Property {
    private double yardSize;
    private int numberOfFloors;

    public House(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus, double yardSize, int numberOfFloors) {
        super(propertyCode, location, numberOfBedrooms, numberOfBathrooms, rentPerMonth, occupiedStatus);
        this.yardSize = yardSize;
        this.numberOfFloors = numberOfFloors;
    }

    public double getYardSize() {
        return yardSize;
    }

    public void setYardSize(double yardSize) {
        this.yardSize = yardSize;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
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
        return "House{" +
                "propertyCode : " + super.getPropertyCode() +
                "\nlocation : " + super.getLocation() + '\'' +
                "\nnumberOfBedrooms : " + super.getNumberOfBedrooms() +
                "\nnumberOfBathrooms : " + super.getNumberOfBathrooms() +
                "\nrentPerMonth : " + super.getRentPerMonth()+
                "\nyardSize : " + getYardSize() +
                "\nnumberOfFloors : " + getNumberOfFloors() +
                "\noccupiedStatus : " + super.isOccupiedStatus() +
                "}\n\n";
    }
}