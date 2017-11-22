/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorbuilding;

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
    private String ID;
    private ArrayList<Sensors> senors;
    
    Reading(String time, String value, String type, String ID) {
        this.time = time;
        this.value = value;
        this.type = type;
        this.ID = ID;
    }

    public String getTime() {
        return time;
    }    

    public String getValue(String value) {
        return value;
    }
    
    public String getType() {
        return type;
    }
    
    public String getID() {
        return ID;
    }
    
    
    
    
    
    
    
}
