package com.pvn.parkinglot;

public class DriverClass {
    public static void main(String[] args) {
        // increased capacity to accommodate more cars for color queries
        OptimizedParkingLot parkingLot = new OptimizedParkingLot(6);

        // park several cars with various colors
        parkingLot.park(new Car("KA-01-HH-1234", "White"));
        parkingLot.park(new Car("KA-01-HH-9999", "Black"));
        parkingLot.park(new Car("KA-01-HH-7777", "Red"));
        parkingLot.park(new Car("KA-01-HH-2701", "White"));
        parkingLot.park(new Car("KA-01-HH-3141", "Blue"));
        parkingLot.park(new Car("KA-01-HH-2020", "Black"));

        System.out.println();
        parkingLot.getStatus();

        System.out.println();
        System.out.println("Slots with color White: " + parkingLot.getSlotsByColor("White"));
        System.out.println("Slots with color Black: " + parkingLot.getSlotsByColor("Black"));
        System.out.println("Slots with color Blue: " + parkingLot.getSlotsByColor("Blue"));
        System.out.println("Slots with color Green (none expected): " + parkingLot.getSlotsByColor("Green"));

        System.out.println();
        // remove one and check mappings update correctly
        parkingLot.remove(2); // remove a Black car
        System.out.println();
        parkingLot.getStatus();

        System.out.println();
        System.out.println("Slots with color Black after removal: " + parkingLot.getSlotsByColor("Black"));
    }
}
