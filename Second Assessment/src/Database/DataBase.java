package Database;

import BaseClass.Property;
public class DataBase {
    private Property[] properties;
    int numberOfProperties=0;

    public DataBase(int size) {
        this.properties = new Property[size];
    }

    public Property[] getPropertiesDB() {
        return properties;

    }

    public void setPropertiesDB(Property[] properties, int numberOfProperties) {
        this.properties = properties;
        this.numberOfProperties=numberOfProperties;
    }

    public int getNumberOfProperties() {
        return numberOfProperties;
    }

}
