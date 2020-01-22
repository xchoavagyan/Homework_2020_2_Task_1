package com.company;

public class Window {
    //region Properties

    private TypeOfWindow typeOfWindow;
    private boolean open;

    //endregion

    //region Constructors

    public Window(TypeOfWindow typeOfWindow) {
        this.typeOfWindow = typeOfWindow;
        this.open = false;
    }

    public Window() {
    }
    //endregion

    //region Getters and Setters


    public TypeOfWindow getTypeOfWindow() {
        return typeOfWindow;
    }

    public void setTypeOfWindow(TypeOfWindow typeOfWindow) {
        this.typeOfWindow = typeOfWindow;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    //endregion

    //region Methods toString() equals() hashCode();
    @Override
    public String toString() {
        return "Window{" +
                "typeOfWindow=" + typeOfWindow +
                ", open=" + open +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Window window = (Window) o;

        if (open != window.open) return false;
        return typeOfWindow == window.typeOfWindow;
    }

    @Override
    public int hashCode() {
        int result = typeOfWindow != null ? typeOfWindow.hashCode() : 0;
        result = 31 * result + (open ? 1 : 0);
        return result;
    }
    //endregion

}
