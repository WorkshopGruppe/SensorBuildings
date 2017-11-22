/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Interface.IReading;
import java.util.ArrayList;

/**
 *
 * @author AskeWulf
 */
public class Reading implements IReading{
    private String time;
    private String value;
    private String type;
    private ArrayList<Sensor> senors;
    
    Reading(String time, String value, String type) {
        this.time = time;
        this.value = value;
        this.type = type;
    }

    public String getTime() {
        return time;
    }    

    public String getValue(double value) {
        return value;
    }
    
    public String getType() {
        return type;
    }
    
    public void setTime() {
        this.time = time;
    }

    public void setValue() {
        this.value = value;
    }    
    
    public void setType() {
        this.type = type;
    }    
    
}
