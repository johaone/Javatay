package main.java.ru.devguru.practices.chapter_1_jama.oop.resources;

public abstract class Resource {

    private final String name;

    private double amount;

    public Resource(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void displayDetails();


    @Override
    public String toString() {
        return "Resource{" +
               "name='" + name + '\'' +
               ", amount=" + amount +
               '}';
    }
}
