package ru.devguru.practices.chapter_1_jama.oop.manager;
import ru.devguru.practices.chapter_1_jama.oop.resources.*;
import ru.devguru.practices.chapter_1_jama.oop.subsystems.EngineSystem;
import ru.devguru.practices.chapter_1_jama.oop.subsystems.LifeSupportSystem;
import ru.devguru.practices.chapter_1_jama.oop.subsystems.SubSystem;

import java.util.ArrayList;
import java.util.List;

public class ResourceManager {

    private static List<Resource> resources = new ArrayList<>();

    private ResourceManager() {
        resources = new ArrayList<>();
    }

    public static void addResource(Resource resource) {
        resources.add(resource);
    }

    public static void findResource(String resourceName, List<Resource> resources) {
        for (Resource resource : resources) {
            if (resource.getName().equals(resourceName)) {
                System.out.println("Ресурс:  " + resource + " найден");
                return;
            }
        }
        System.out.println("Ресурс: " + resourceName + "' не найден.");
    }

    public static void displayAllResources(List<Resource> resources) {
        for (Resource resource : resources) {
            resource.displayDetails();
        }
    }

    public static void main(String[] args) {

        // создание ресурсов
        Resource energy = new EnergyResource("energy", 57.5, 220.0);
        Resource fuel = new FuelResource("fuel", 93.3, "oil", List.of("One", "Two", "Three"));
        Resource water = new WaterResource("water", 66.6, 55.0);
        Resource oxygen = new OxygenResource("oxygen", 96.0, 30.0);

        // добавление ресурсов в список
        addResource(energy);
        addResource(fuel);
        addResource(water);
        addResource(oxygen);

        // отображение всех ресурсов
        displayAllResources(resources);

        // добавление нового ресурса
        System.out.println("Добавить ресурс");
        Resource resource = new OxygenResource("newWater", 20.0, 30.0);
        addResource(resource);

        // отображение всех ресурсов после добавления нового ресурса
        displayAllResources(resources);

        // поиск ресурса по названию
        System.out.println("Поиск ресурса по названию");
        findResource("oxygen", resources);

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
