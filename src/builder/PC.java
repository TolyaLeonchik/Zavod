package builder;

public class PC {
    private String motherboard;
    private String cpu;
    private int capacityRAM;
    private int memoryCapacity;
    private int powerSupply;

    public static class Builder {
        private PC pc;

        public Builder() {
            this.pc = new PC();
        }

        public Builder setMotherboard(String name) {
            pc.setMotherboard(name);
            return this;
        }
        public Builder setCpu(String nameCpu) {
            pc.setCpu(nameCpu);
            return this;
        }
        public Builder setCapacityRAM(int capacity) {
            pc.setCapacityRAM(capacity);
            return this;
        }
        public Builder setMemoryCapacity(int memoryCapacity) {
            pc.setMemoryCapacity(memoryCapacity);
            return this;
        }
        public Builder setPowerSupply(int powerSupply) {
            pc.setPowerSupply(powerSupply);
            return this;
        }
        public PC build() {
            return pc;
        }
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getCapacityRAM() {
        return capacityRAM;
    }

    public void setCapacityRAM(int capacityRAM) {
        this.capacityRAM = capacityRAM;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "PC{" +
                "Motherboard='" + motherboard + '\'' +
                ", CPU='" + cpu + '\'' +
                ", capacity RAM=" + capacityRAM +
                "GB, memory capacity=" + memoryCapacity +
                "TB, power supply=" + powerSupply +
                "W}";
    }
}
