package ru.devguru.practices.chapter_1_jama.oop.subsystems;
import ru.devguru.practices.chapter_1_jama.oop.resources.Resource;

public interface Consumable {

    void consume(Resource resource, double amount);
}
