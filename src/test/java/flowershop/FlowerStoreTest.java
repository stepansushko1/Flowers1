package flowershop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerStoreTest {
    private FlowerBucket buck;
    private FlowerPack flow_pack1;
    private FlowerPack flow_pack2;
    private Flower flower1;
    private Flower flower2;
    private FlowerStore shop;

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

        shop = new FlowerStore();

        shop.flowerBuckets.add(buck);
        shop.search(flower1.getFlowerType(), 1000);
    }

    @Test
    void search() {

        assertEquals(shop.availableBuckets.toString(),"[FlowerBucket(flowerPacks=[FlowerPack(flower=Flower(price=5.0, sepalLenght=0.0, color=null, flowerType=ROSE), amount=3), FlowerPack(flower=Flower(price=5.0, sepalLenght=0.0, color=null, flowerType=CHAMOMILE), amount=3)])]");
        shop.availableBuckets.remove(0);
        assertEquals(shop.availableBuckets.toString(), "[]");
    }
}