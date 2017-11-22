/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Sensor;
import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public interface IBuilding {
    public String getName();
    public String getAddress();
    public ArrayList<Sensor> getSensors();
    public void addSensor(Sensor sensor);
    public void removeSensor(Sensor sensor);
}
