package org.example.chapter07.composite;

import java.util.ArrayList;
import java.util.List;

public class DeviceGroup implements Device {
   private List<Device> devices = new ArrayList<>();

   public void addDevice(Device d) {
       devices.add(d);
   }

   public void removeDevice(Device d){
       devices.remove(d);
   }

    @Override
    public void turnOn() {
        for (Device device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        for (Device device : devices) {
            device.turnOff();
        }
    }
}
