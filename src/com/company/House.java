package com.company;

import java.util.ArrayList;

public class House {
    //region Properties

    private ArrayList<Window> windows = new ArrayList<>();
    private ArrayList<Door> doors = new ArrayList<>();
    private String keyPassword;

    //endregion

    //region Constructors

    public House(ArrayList<Window> windows, ArrayList<Door> doors, String keyPassword) {
        this.windows = windows;
        this.doors = doors;
        this.keyPassword = keyPassword;
    }

    public House(String keyPassword) {
        this.keyPassword = keyPassword;
    }

    public House() {
    }

    //endregion

    //region Getters and Setters

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public void setWindows(ArrayList<Window> windows) {
        this.windows = windows;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public String getKeyPassword() {
        return keyPassword;
    }

    public void setKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
    }
    //endregion

    // region Public Methods

    public void addDoor(Door door) {
        this.doors.add(door);
    }

    public void addWindow(Window window) {
        this.windows.add(0, window);
    }

    public void lockTheHouseByKey(String keyPassword) {
        for (int i = 0; i < doors.size(); i++) {
            if (doors.get(i).getKey().equals(keyPassword)) {
                System.out.println("Your House is Locked");
                break;
            }else if (doors.get(i).getKey().equals("Open")){
                System.out.println("https://www.youtube.com/watch?v=n5BXm38zrm0");
                break;
            }
        }

    }

    public void printQuantityOfWindows() {
        System.out.println("House have a " + windows.size() + " windows");
    }

    public void printQuantityOfDoors() {
        System.out.println("House have a " + doors.size() + " doors");

    }

    //endregion

    //region Methods toString() equals() hashCode();
    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", keyPassword='" + keyPassword + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        if (windows != null ? !windows.equals(house.windows) : house.windows != null) return false;
        if (doors != null ? !doors.equals(house.doors) : house.doors != null) return false;
        return keyPassword != null ? keyPassword.equals(house.keyPassword) : house.keyPassword == null;
    }

    @Override
    public int hashCode() {
        int result = windows != null ? windows.hashCode() : 0;
        result = 31 * result + (doors != null ? doors.hashCode() : 0);
        result = 31 * result + (keyPassword != null ? keyPassword.hashCode() : 0);
        return result;
    }
    //endregion
}
