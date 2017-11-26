package Business;

import Interface.IBuilding;
import java.util.ArrayList;

/**
 *
 * @author Robin
 */
public class Building implements IBuilding{
    private String name;
    private String address;
    private ArrayList<Sensor> sensors;
    
    public Building(String name, String address){
        this.name = name;
        this.address = address;
        this.sensors = new ArrayList<>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public ArrayList<Sensor> getSensors(){
        return this.sensors;
    }
    
    public void addSensor(Sensor sensor){
        this.sensors.add(sensor);
    }
    
    public void removeSensor(Sensor sensor){
        this.sensors.remove(sensor);
    }
    public void makeSensor(String id, int time, double value, String type){
        Sensor s = new Sensor(id);
        s.addReading(time, value, type);
        this.sensors.add(s);
    }
    
    
    
}
