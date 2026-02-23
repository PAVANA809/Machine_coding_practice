package com.pvn.parkinglot;

public class ParkingSlot {
    private int slotNumber;
    private Car parkedCar;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isFree() {
        return parkedCar == null;
    }

    public void parkCar(Car car) {
        this.parkedCar = car;
    }

    public void removeCar() {
        this.parkedCar = null;
    }

    public Car getParkedCar() {
        return parkedCar;
    }

    public int getSlotNumber() {
        return slotNumber;
    }
}
