package ru.devguru.practices.chapter_1_jama.oop.subsystems;


import ru.devguru.practices.chapter_1_jama.oop.resources.Resource;

public class EngineSystem extends SubSystem {

    public EngineSystem() {
        super("Engine system");
    }

    @Override
    public void useResource(Resource resource, double amount) {
        super.consume(resource, amount);
        System.out.println("имя ресурса: " + resource.getName() + " " + "количество: " + resource.getAmount());
    }

    @Override
    public void consume(Resource resource, double amount) {
        super.consume(resource, amount);
        if (resource.getAmount() >= amount) {
            double remainResources = resource.getAmount();
            resource.setAmount(remainResources);
        }
    }
}
