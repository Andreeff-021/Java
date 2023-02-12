package seminar_6;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addLaptop(new Laptop(26999, "Acer", 4, 1.1, 128, "Windows 10"))
                .addLaptop(new Laptop(27999, "ASUS", 8, 2.1, 256, "Windows 11"))
                .addLaptop(new Laptop(28999, "Lenovo", 8, 2.1, 512, "Windows 10"))
                .addLaptop(new Laptop(27999, "ASUS", 12, 2.1, 256, "Windows 11"))
                .addLaptop(new Laptop(27999, "Acer", 16, 2.3, 512, "Windows 11"));

        System.out.println(store);
        store.findByCondition(8);
    }
}
