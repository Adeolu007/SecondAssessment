package BaseClass;
import Enums.PropertyCode;
import Others.PropertyCodeGenerator;
public abstract class Property {
    private String propertyCode;
    private String location;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double rentPerMonth;
    private boolean isOccupiedStatus;

    private PropertyCode prefix;

    public Property(String propertyCode, String location, int numberOfBedrooms, int numberOfBathrooms, double rentPerMonth, boolean occupiedStatus) {
        this.propertyCode = PropertyCodeGenerator.getCode(prefix);
        this.location = location;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.rentPerMonth = rentPerMonth;
        this.prefix=prefix;
        this.isOccupiedStatus = occupiedStatus;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = PropertyCodeGenerator.getCode(prefix);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public double getRentPerMonth() {
        return rentPerMonth;
    }

    public void setRentPerMonth(double rentPerMonth) {
        this.rentPerMonth = rentPerMonth;
    }

    public boolean isOccupiedStatus() {
        return isOccupiedStatus;
    }

    public void setOccupiedStatus(boolean occupiedStatus) {
        this.isOccupiedStatus = occupiedStatus;
    }

    public PropertyCode getPrefix() {
        return prefix;
    }

    public void setPrefix(PropertyCode prefix) {
        this.prefix = prefix;
    }

    public abstract double rentalIncome();
    @Override
    public String toString() {
        return "Property{" +
                "propertyCode='" + propertyCode + '\'' +
                ", location='" + location + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", rentPerMonth=" + rentPerMonth +
                ", occupiedStatus=" + isOccupiedStatus +
                '}';
    }
}
