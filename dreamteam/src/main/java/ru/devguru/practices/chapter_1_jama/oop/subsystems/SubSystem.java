package ru.devguru.practices.chapter_1_jama.oop.subsystems;

import ru.devguru.practices.chapter_1_jama.oop.resources.Resource;

public abstract class SubSystem implements Consumable {

    private final String name;

    public SubSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void consume(Resource resource, double amount) {
        if (resource.getAmount() >= amount) {
            double remainResources = resource.getAmount() - amount;
            resource.setAmount(remainResources);
        } else {
            System.out.println("Недостаточно ресурса");
        }
    }

    public abstract void useResource(Resource resource, double amount);

    public static class ConsumptionReport {
    }
}
