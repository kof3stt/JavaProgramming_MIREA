package shop;

public class Computer {
    private String CPU;
    private String motherboard;
    private int RAM;
    private String graphics_card;

    public Computer(String CPU, String motherboard, int RAM, String graphics_card) {
        this.CPU = CPU;
        this.motherboard = motherboard;
        this.RAM = RAM;
        this.graphics_card = graphics_card;
    }

    public String getCPU() {
        return CPU;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public int getRAM() {
        return RAM;
    }

    public String getGraphics_card() {
        return graphics_card;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setGraphics_card(String graphics_card) {
        this.graphics_card = graphics_card;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", RAM=" + RAM +
                ", graphics_card='" + graphics_card + '\'' +
                '}';
    }

    public Computer() {
    }
}
