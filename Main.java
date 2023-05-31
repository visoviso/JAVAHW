package homework13;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Specification> set = new HashSet<>();
        set.add(new Specification("comp1", 10000, "ASUS", "China", "Windows11", 256, 2021));
        set.add(new Specification("comp2", 2000, "Apple", "USA", "Apple", 128, 2022));
        set.add(new Specification("comp3", 3000, "Lenovo", "Korea", "Windows11", 128, 2023));
        

    Op operation = new Op(set);
    operation.start();
    }

}
