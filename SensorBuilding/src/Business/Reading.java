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
    private int time;
    private double value;
    private String type;
    private ArrayList<Sensor> sensors;
    
    Reading(int time, double value, String type) {
        this.time = time;
        this.value = value;
        this.type = type;
        this.sensors = new ArrayList<>();
    }

    public int getTime() {
        return time;
    }    

    public double getValue() {
        return this.value;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setTime(int time) {
        this.time = time;
    }

    public void setValue(double value) {
        this.value = value;
    }    
    
    public void setType(String type) {
        this.type = type;
    }    
    
}
