package com.company;

public class Door {

    //region Properties
    private PlaceOfDoor placeOfDoor;
    private TypeOfDoor typeOfDoor;
    private String key;
    //endregion

    //region Constructors

    public Door(PlaceOfDoor placeOfDoor, TypeOfDoor typeOfDoor, String key) {
        this.typeOfDoor = typeOfDoor;
        this.key = key;
        if (placeOfDoor.equals("IN")) {
            this.placeOfDoor = PlaceOfDoor.OUT;
        } else {
            this.placeOfDoor = placeOfDoor;
        }
    }

    public Door(PlaceOfDoor placeOfDoor, TypeOfDoor typeOfDoor) {
        if (placeOfDoor.equals("OUT")) {
            this.placeOfDoor = PlaceOfDoor.IN;
        } else {
            this.placeOfDoor = placeOfDoor;
        }

        this.typeOfDoor = typeOfDoor;
        this.key = "Open";
    }

    public Door() {
    }

    //endregion

    //region Getters and Setters

    public PlaceOfDoor getPlaceOfDoor() {
        return placeOfDoor;
    }

    public void setPlaceOfDoor(PlaceOfDoor placeOfDoor) {
        this.placeOfDoor = placeOfDoor;
    }

    public TypeOfDoor getTypeOfDoor() {
        return typeOfDoor;
    }

    public void setTypeOfDoor(TypeOfDoor typeOfDoor) {
        this.typeOfDoor = typeOfDoor;
    }

    public String getKey() {

        return key;
    }

    public void setKey(String key) {
        if (this.placeOfDoor.equals("OUT")) {
            this.key = key;
        } else {
            this.key = "Open";
        }

    }
    //endregion

    //region Methods toString() equals() hashCode();
    @Override
    public String toString() {
        return "Door{" +
                "doorPlace=" + placeOfDoor +
                ", typeOfDoor=" + typeOfDoor +
                ", key='" + key + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Door door = (Door) o;

        if (placeOfDoor != door.placeOfDoor) return false;
        if (typeOfDoor != door.typeOfDoor) return false;
        return key != null ? key.equals(door.key) : door.key == null;
    }

    @Override
    public int hashCode() {
        int result = placeOfDoor != null ? placeOfDoor.hashCode() : 0;
        result = 31 * result + (typeOfDoor != null ? typeOfDoor.hashCode() : 0);
        result = 31 * result + (key != null ? key.hashCode() : 0);
        return result;
    }
    //endregion

}
