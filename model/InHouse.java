package model;

public class InHouse extends Part {

    private int machineID;

    public InHouse(int partID, String partName, double price, int stock, int max, int min, int machineID) {
        super(partID, partName, price, stock, max, min);
        this.machineID = machineID;
    }

    public int getMachineID() {
        return this.machineID;
    }

    public void setCompanyName(int machineID) {
        this.machineID = machineID;
    }
}