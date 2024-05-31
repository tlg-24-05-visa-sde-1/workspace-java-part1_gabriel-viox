package com.transportation;

public class BoatClient {
    public static void main(String[] args) throws DestinationUnreachableException {
        Boat boat = new Boat("Ella Belle");
        boat.moveTo("North Austin");
    }
}
