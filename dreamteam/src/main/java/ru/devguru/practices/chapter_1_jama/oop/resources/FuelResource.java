package main.java.ru.devguru.practices.chapter_1_jama.oop.resources;

import java.util.List;

public final class FuelResource extends Resource {

    private final String type;
    private final List<String> list;

    public FuelResource(String name, double amount, String type, List<String> list) {
        super(name, amount);
        this.type = type;
        this.list = List.of("One", "Two", "Three", "Four", "Five");
    }

    public String getType() {
        return type;
    }

    public List<String> getList() {
        return list;
    }

    @Override
    public void displayDetails() {
        System.out.println("имя ресурса: " + getName() + " , " + "количество: " + getAmount() + " , " + "тип: " + type + " , " + "список компонентов: " + list);
    }
}
