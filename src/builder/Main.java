package builder;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC.Builder()
                .setMotherboard("Gigabyte H410M-S2H V.3")
                .setCpu("Intel Core i3-10100")
                .setCapacityRAM(8)
                .setMemoryCapacity(2)
                .setPowerSupply(500)
                .build();
        System.out.println(pc);
    }
}
