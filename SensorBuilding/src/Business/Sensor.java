package Business;

import Interface.ISensor;
import java.util.ArrayList;

/**
 *
 * @author Robin
 */
public class Sensor implements ISensor{
    private String Value;
    private String ID;
    private ArrayList<Reading> readings;
    
    Sensor(String ID, String value){
        this.ID = ID;
        this.Value = value;
        this.readings = new ArrayList<>();
    }

    public String getValue() {
        return Value;
    }

    public String getID() {
        return ID;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}
