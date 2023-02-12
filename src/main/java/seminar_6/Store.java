package seminar_6;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Laptop> laptops = new ArrayList<>();
    public List<Laptop> getLaptops() {
        return laptops;
    }

    public Store addLaptop(Laptop laptop) {
        this.laptops.add(laptop);
        return this;
    }

    public void findByCondition(int ram){
        for(Laptop laptop : getLaptops()){
            if (laptop.getRam() == ram) System.out.println(laptop);
        }
    }

    @Override
    public String toString() {
        StringBuilder laotopInStore = new StringBuilder();
        for (Laptop laptop : this.getLaptops()){
            laotopInStore.append(laptop.toString());
            laotopInStore.append("\n");
        }
        return laotopInStore.toString();
    }


}
