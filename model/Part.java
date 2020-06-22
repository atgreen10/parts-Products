package model;

public abstract class Part {
    private int partID;
    private int partStock;
    private int partMax;
    private int partMin;
    private String partName;
    private double partPrice;

    public Part(int partID, String partName, double partPrice, int partStock, int partMax, int partMin) {
        this.partID = partID;
        this.partName = partName;
        this.partStock = partStock;
        this.partPrice = partPrice;
        this.partMax = partMax;
        this.partMin = partMin;
    }

    public int getPartID() {
        return partID;
    }

    public void setPartID(int partID) {
        this.partID = partID;
    }

    public int getStock() {
        return partStock;
    }

    public void setStock(int partStock) {
        this.partStock = partStock;
    }

    public int getMax() {
        return partMax;
    }

    public void setMax(int partMax) {
        this.partMax = partMax;
    }

    public int getMin() {
        return partMin;
    }

    public void setMin(int partMin) {
        this.partMin = partMin;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public double getPrice() {
        return partPrice;
    }

    public void setPrice(double partPrice) {
        this.partPrice = partPrice;
    }
}
