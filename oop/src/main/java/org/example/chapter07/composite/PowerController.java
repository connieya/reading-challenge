package org.example.chapter07.composite;

public class PowerController {

    public void turnOn(Long deviceId) {
        Device device = findDeviceById(deviceId);
        device.turnOn();
    }

    public void turnGroupOn(Long groupId) {
        DeviceGroup group = findGroupById(groupId);
        group.turnAllOn();
    }

    private DeviceGroup findGroupById(Long groupId) {
        return null;
    }

    private Device findDeviceById(Long deviceId) {
        return null;
    }
}
