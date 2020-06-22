package model;

public class Outsource extends Part {

    private String companyName;

    public Outsource(int partID, String partName, double price, int stock, int max, int min, String companyName) {
        super(partID, partName, price, stock, max, min);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

