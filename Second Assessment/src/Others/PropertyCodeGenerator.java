package Others;
import Enums.PropertyCode;

public class PropertyCodeGenerator {
    private static int apartmentCount = 1;
    private static int houseCount = 1;
    private static int condoCount = 1;

    public static String getCode(PropertyCode prefix) {
        String propertyCode ="" ;

        switch (prefix){

            case HOU : {
                propertyCode = "HOU" + String.format("%03d", houseCount++);
            }
            break;
            case APA : {
                propertyCode = "APA" + String.format("%03d", apartmentCount++);
            }
            break;
            case CON : {
                propertyCode = "CON" + String.format("%03d", condoCount++);
            }
            break;
            default:
        }

        return propertyCode;
    }
}
