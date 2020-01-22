package com.company;

public class Main {

    public static void main(String[] args) {

        // Creating Windows and Doors for home

        Window livingRoomWindow = new Window(TypeOfWindow.FIXED_WINDOW);
        Window kitchenWindow = new Window(TypeOfWindow.PIVOTED_WINDOW);
        Window bedroomWindow = new Window(TypeOfWindow.LOUVERED_WINDOW);

        Door bedroomDoor = new Door(PlaceOfDoor.IN, TypeOfDoor.WOOD_DOOR);
        Door livingRoomDoor = new Door(PlaceOfDoor.IN, TypeOfDoor.GLASS_DOOR);
        Door kitchenDoor = new Door(PlaceOfDoor.IN, TypeOfDoor.PANELED_DOOR);
        Door entranceDoor = new Door(PlaceOfDoor.OUT, TypeOfDoor.STEEL_DOOR, "sezam");

        House home = new House("sezam");

        home.addDoor(entranceDoor);
        home.addDoor(kitchenDoor);
        home.addDoor(livingRoomDoor);
        home.addDoor(bedroomDoor);
        home.addWindow(bedroomWindow);
        home.addWindow(kitchenWindow);
        home.addWindow(livingRoomWindow);
        home.lockTheHouseByKey(home.getKeyPassword());
        home.printQuantityOfDoors();
        home.printQuantityOfWindows();

        System.out.println("--------------------------");

        // Creating Window and door for Playing Home
        Window playWindow = new Window(TypeOfWindow.SLIDING_WINDOW);
        Door playDoor = new Door(PlaceOfDoor.IN, TypeOfDoor.ALUMINUM_DOOR);

        House playHome = new House("play");

        playHome.addWindow(playWindow);
        playHome.addDoor(playDoor);
        playHome.lockTheHouseByKey(playHome.getKeyPassword());
        playHome.printQuantityOfDoors();
        playHome.printQuantityOfWindows();


    }
}
