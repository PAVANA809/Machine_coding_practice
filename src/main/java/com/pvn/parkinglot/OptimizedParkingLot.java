package com.pvn.parkinglot;

import java.util.*;

public class OptimizedParkingLot{

    Map<Integer, ParkingSlot> slotMap;
    PriorityQueue<Integer> freeSlots;

    Map<String, Set<Integer>> colorToSlotsMap = new HashMap<>();

    public OptimizedParkingLot(int capacity) {
        slotMap = new HashMap<>();
        freeSlots = new PriorityQueue<>();
        for(int i = 1; i <= capacity; i++){
            slotMap.put(i, new ParkingSlot(i));
            freeSlots.add(i);
        }
    }

    public void remove(int slotNumber) {
        if(slotNumber <= 0 || slotNumber > slotMap.size()) {
            System.out.println("Invalid slot number");
            return;
        }
        ParkingSlot slot = slotMap.get(slotNumber);
        if(slot.isFree()) {
            System.out.println("Slot is already empty");
        } else {
            colorToSlotsMap.get(slot.getParkedCar().getColor()).remove(slotNumber);
            slot.removeCar();
            freeSlots.offer(slot.getSlotNumber());
            System.out.println("Slot " + slot.getSlotNumber() + " is now free.");
        }
    }

    public void park(Car car) {
        if(freeSlots.isEmpty()) {
            System.out.println("Parking lot is full.");
            return;
        }

        ParkingSlot parkingSlot = slotMap.get(freeSlots.poll());
        parkingSlot.parkCar(car);
        colorToSlotsMap.computeIfAbsent(car.getColor(),k -> new HashSet<>()).add(parkingSlot.getSlotNumber());
        System.out.println("Car parked at slot " + parkingSlot.getSlotNumber());
    }

    public void getStatus() {
        System.out.println("Slot number\t | Registration number\t | Color");
        for(Map.Entry<Integer, ParkingSlot> entry: slotMap.entrySet()) {
            ParkingSlot parkingSlot = slotMap.get(entry.getKey());
            if(!parkingSlot.isFree())
                System.out.println(parkingSlot.getSlotNumber() + "\t |" + parkingSlot.getParkedCar().getRegistrationNumber() + "\t |" + parkingSlot.getParkedCar().getColor());
        }
    }

    public Set<Integer> getSlotsByColor(String color) {
        return colorToSlotsMap.getOrDefault(color, Collections.emptySet());
    }
}
