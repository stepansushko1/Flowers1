package flowershop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerpack;
    @BeforeEach
    void setUp(){
        Flower flower = new Flower(FlowerType.TULIP);
        flower.setPrice(5);
        flowerpack = new FlowerPack(flower, 10);

    }

    @Test
    void getPrice() {
        assertEquals(50, flowerpack.getPrice());
    }

    @Test
    void getAmount() {
        assertEquals(10, flowerpack.getAmount());
    }
}