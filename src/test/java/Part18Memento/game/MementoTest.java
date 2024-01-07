package Part18Memento.game;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {
    Memento memento;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        memento = new Memento(1000);
    }

    @org.junit.jupiter.api.Test
    void getMoney() {
        assertEquals(1000, memento.getMoney());
    }

    @org.junit.jupiter.api.Test
    void addFruit() {
        memento.addFruit("사과");
        List<String> fruits = List.of("사과");
        assertEquals(fruits, memento.getFruits());
    }

    @org.junit.jupiter.api.Test
    void getFruits() {
        List<String> fruits = new ArrayList<>();
        assertEquals(fruits, memento.getFruits());
    }
}
