package main.java.ru.devguru.practices.chapter_1_jama.oop.manager;

import main.java.ru.devguru.practices.chapter_1_jama.oop.resources.*;
import main.java.ru.devguru.practices.chapter_1_jama.oop.subsystems.EngineSystem;
import main.java.ru.devguru.practices.chapter_1_jama.oop.subsystems.LifeSupportSystem;
import main.java.ru.devguru.practices.chapter_1_jama.oop.subsystems.SubSystem;

import java.util.ArrayList;
import java.util.List;

public class ResourceManager {

    private static List<Resource> resources;

    public static void addResource(Resource resource) {
        if (resources == null) {
            resources = new ArrayList<>();
        }

        for (Resource res : resources) {
            if (resource.equals(res)) {
                res.setAmount(resource.getAmount() + res.getAmount());
                return;
            }
        }

        resources.add(resource);
    }

    public static Resource findResource(String resourceName, List<Resource> resources) {
        for (Resource resource : resources) {
            if (resource.getName().equals(resourceName)) {
                return resource;
            }
        }
        return null;
    }

    public static void displayAllResources(List<Resource> resources) {
        for (Resource resource : resources) {
            resource.displayDetails();
        }
    }

    public static void main(String[] args) {

        // создание ресурсов
        EnergyResource energy = new EnergyResource("energy", 57.5, 220.0);
        Resource fuel = new FuelResource("fuel", 93.3, "oil", List.of("One", "Two", "Three"));
        Resource water = new WaterResource("water", 66.6, 55.0);
        Resource oxygen = new OxygenResource("oxygen", 96.0, 30.0);

        // добавление ресурсов в список
        List<Resource> resourceList = new ArrayList<>();
        resourceList.add(energy);
        resourceList.add(fuel);
        resourceList.add(water);
        resourceList.add(oxygen);

        // отображение всех ресурсов
        displayAllResources(resourceList);

        // добавление ресурса
        System.out.println("Добавить ресурс");
        Resource resource = new OxygenResource("oxygen", 96.0, 30.0);
        resource.setAmount(20.0);
        addResource(resource);

        // отображение всех ресурсов для проверки
        displayAllResources(resourceList);

        // поиск ресурса по названию
        System.out.println("Поиск ресурса  по названию");
        System.out.println(findResource("oxygen", resourceList));

        // создание подсистем используя полиморфизм
        System.out.println("Подсистемы");
        SubSystem engineSystem = new EngineSystem();
        SubSystem supportSystem = new LifeSupportSystem();

        // использование ресурсов
        System.out.println("Ресурсы после потребления");
        engineSystem.useResource(fuel, 50.0);
        supportSystem.useResource(water, 10.0);
    }
}
