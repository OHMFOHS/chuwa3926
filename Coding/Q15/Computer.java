package chuwa3926.Coding.Q15;

public class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDrive hd;

    // Constructor creates all components internally (Composition)
    public Computer(String cpuBrand, int cpuSpeed, int ramSize, int hdSize, String hdType) {
        this.cpu = new CPU(cpuBrand, cpuSpeed);
        this.ram = new RAM(ramSize);
        this.hd = new HardDrive(hdSize, hdType);
    }

    // Method to return specs of all components
    public void getSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
        System.out.println("Hard Drive: " + hd);
    }

    // Main method to test
    public static void main(String[] args) {
        Computer myPC = new Computer("Intel", 8, 16, 512, "SSD");
        myPC.getSpecs();
    }
}
