package flowershop;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower;
    private FlowerType tp;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower = new Flower(tp.ROSE);
        flower.setPrice(5);
        flower.setSepalLenght(4.6);
    }

    @org.junit.jupiter.api.Test
    void getSepalLenght() {
        assertEquals(4.6, flower.getSepalLenght());
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(5, flower.getPrice());
    }
}