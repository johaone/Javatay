package main.java.ru.devguru.practices.chapter_1_jama.oop.resources;

public final class WaterResource extends Resource {

    private final double purityLevel;

    public WaterResource(String name, double amount, double purityLevel) {
        super(name, amount);
        this.purityLevel = purityLevel;
    }

    public double getPurityLevel() {
        return purityLevel;
    }

    @Override
    public void displayDetails() {
        System.out.println("имя ресурса: " + getName() + " , " + "количество: " + getAmount() + " , " + "частота напряжения: " + getPurityLevel());
    }
}
