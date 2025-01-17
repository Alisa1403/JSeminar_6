package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HomeworkTest {

    @Test
    void filterSuccessful() {

        Map<String, String> entryMap = new HashMap<>();
        entryMap.put("os", "windows");

        List<Notebook> entryList = new ArrayList<>();
        Notebook notebook1 = new Notebook("HP", "4525s", 512, 16, "brown", "Windows");
        Notebook notebook2 = new Notebook("Lenovo", "Legion", 1024, 32, "black", "Windows");
        Notebook notebook3 = new Notebook("Asus", "Vivobook", 256, 16, "black", "Linux");
        Notebook notebook4 = new Notebook("HP", "Pavilion", 256, 8, "silver", "Linux");
        entryList.add(notebook1);
        entryList.add(notebook2);
        entryList.add(notebook3);
        entryList.add(notebook4);

        List<Notebook> expectedList = new ArrayList<>();
        expectedList.add(notebook1);
        expectedList.add(notebook2);

        Homework hw = new Homework();
        List<Notebook> actualList = hw.filter(entryMap, entryList);

        Assertions.assertIterableEquals(expectedList, actualList);

    }
}