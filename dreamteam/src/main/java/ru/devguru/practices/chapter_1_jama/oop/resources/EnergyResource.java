package ru.devguru.practices.chapter_1_jama.oop.resources;

public final class EnergyResource extends Resource {

    private final double voltage;

    public EnergyResource(String name, double amount, double voltage) {
        super(name, amount);
        this.voltage = voltage;
    }

    public double getVoltage() {
        return voltage;
    }

    @Override
    public void displayDetails() {
        System.out.println("имя ресурса: " + getName() + " , " + "количество: " + getAmount() + " , " + "напряжение:" + getVoltage());
    }
}
