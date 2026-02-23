package com.pvn.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    List<ParkingSlot> slots;

    public ParkingLot(int capacity) {
        slots = new ArrayList<>();
        for(int i=1; i<= capacity; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    public void park(Car car) {
        for(ParkingSlot parkingSlot: slots) {
            if(parkingSlot.isFree()) {
                parkingSlot.parkCar(car);
                System.out.println("Car parked at slot " + parkingSlot.getSlotNumber());
                return;
            }
        }
        System.out.println("Parking lot is full.");
    }

    public void remove(int slotNumber) {
        if(slotNumber <= 0 || slotNumber > slots.size()) {
            System.out.println("Invalid slot number");
            return;
        }
        ParkingSlot slot = slots.get(slotNumber - 1);
        if(slot.isFree()) {
            System.out.println("Slot is already empty");
        } else {
            slot.removeCar();
            System.out.println("Slot " + slot.getSlotNumber() + " is now free.");
        }
    }

    public void getStatus() {
        System.out.println("Slot number\t | Registration number\t | Color");
        slots.stream()
                .filter(slot -> !slot.isFree())
                .forEach(slot -> System.out.println(slot.getSlotNumber() + "\t |" + slot.getParkedCar().getRegistrationNumber() + "\t |" + slot.getParkedCar().getColor()));
    }
}
