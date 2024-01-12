package kata1;

public class Car {

    private String carName;
    private int km;
    private double usagePerKm;

    public Car(String carName, int km, double usagePerKm) {
        this.carName = carName;
        this.km = km;
        this.usagePerKm = usagePerKm;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getUsagePerKm() {
        return usagePerKm;
    }

    public void setUsagePerKm(double usagePerKm) {
        this.usagePerKm = usagePerKm;
    }

    public double totalUsage(){
        return km * usagePerKm;
    }
}
