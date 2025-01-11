package ru.devguru.practices.chapter_1_jama.oop.resources;

public final class OxygenResource extends Resource {

    private final double pressure;

    public OxygenResource(String name, double amount, double pressure) {
        super(name, amount);
        this.pressure = pressure;
    }

    @Override
    public void displayDetails() {
        System.out.println("имя ресурса: " + getName() + " , " + "количество: " + getAmount() + " , " + "давление: " + pressure);
    }
}
