package Others;

import Enums.PropertyCode;

public class PropertyName {

    public static String propertyName(PropertyCode prefix) {
        String name = "";
        switch (prefix) {

            case HOU -> {
                name = "Houses";
            }
            case APA -> {
                name = "Apartments";
            }
            case CON -> {
                name = "Condos";
            }
        }
        return  name;
    }
}
