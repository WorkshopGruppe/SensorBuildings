package Business;

/**
 *
 * @author Robin
 */
public class tester {
    public static void main(String[] args) {
        Building b = new Building("b1", "addresse1");
        b.makeSensor("temp 1", 12, 16.5, "temp");
        b.makeSensor("CO2 1", 13, 17, "CO2");
        
        System.out.println(b.getSensors());
    }
    
}
