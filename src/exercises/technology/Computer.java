package exercises.technology;

public class Computer {

    private String brandName;
    private String serialNumber;
    private String operatingSystem;
    private boolean isON = false;

    public Computer(String brandName, String serialNumber, String operatingSystem, boolean isON) {
        this.brandName = brandName;
        this.serialNumber = serialNumber;
        this.operatingSystem = operatingSystem;
        this.isON = isON;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isON() {
        return isON;
    }

    public void setON(boolean ON) {
        isON = ON;
    }

}
