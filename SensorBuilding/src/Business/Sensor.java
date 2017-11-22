package Business;

import Interface.ISensor;
import java.util.ArrayList;

/**
 *
 * @author Robin
 */
public class Sensor implements ISensor{
   // private String Value;
    private String ID;
    private ArrayList<Reading> readings;
    
    Sensor(String ID){
        this.ID = ID;
        //this.Value = value;
        this.readings = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }
    
    public void addReading(int time, double value, String type){
        Reading reading = new Reading(time, value, type);
        this.readings.add(reading);
    }
}
