package flowershop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket buck;
    private FlowerPack flow_pack1;
    private FlowerPack flow_pack2;
    private Flower flower1;
    private Flower flower2;
    @BeforeEach
    void setUp() {
        flower1 = new Flower(FlowerType.ROSE);
        flower2 = new Flower(FlowerType.CHAMOMILE);

        flower1.setPrice(5);
        flower2.setPrice(5);

        flow_pack1 = new FlowerPack(flower1, 3);
        flow_pack2 = new FlowerPack(flower2, 3);

        buck = new FlowerBucket();

        buck.addFlowerPack(flow_pack1);
        buck.addFlowerPack(flow_pack2);

    }

    @Test
    void getPrice() {
        assertEquals(30, buck.getPrice());
    }

    @Test
    void getNumOfPacks() {
        assertEquals(2 ,buck.getNumOfPacks());
    }
}