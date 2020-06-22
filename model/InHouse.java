package model;

public class InHouse extends Part {

    private int machineID;

    public InHouse(int partID, String partName, double partPrice, int partStock, int partMax, int partMin, int machineID) {
        super(partID, partName, partPrice, partStock, partMax, partMin);
        this.machineID = machineID;
    }

    public int getMachineID() {
        return this.machineID;
    }

    public void setCompanyName(int machineID) {
        this.machineID = machineID;
    }
