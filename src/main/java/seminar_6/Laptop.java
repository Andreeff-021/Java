package seminar_6;

public class Laptop {
    private int price;
    private String brand;
    private int ram;
    private double cpu;
    private int ssd;
    private String operatingSystem;

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public double getCpu() {
        return cpu;
    }

    public int getSsd() {
        return ssd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public Laptop(int price, String brand, int ram, double cpu, int ssd, String operatingSystem) {
        this.price = price;
        this.brand = brand;
        this.ram = ram;
        this.cpu = cpu;
        this.ssd = ssd;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString(){
        return String.format("Цена: %d, Бренд: %s, RAM: %d Гб, CPU: %2.1f Ггц, SSD: %d Гб, OP: %s"
                            , price, brand, ram, cpu, ssd, operatingSystem);
    }
}
