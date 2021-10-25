import flowershop.*;

public class Main {

    public static void main(String[] args){
        Flower flower1 = new Flower(FlowerType.ROSE);
        Flower flower2 = new Flower(FlowerType.CHAMOMILE);
        Flower flower3 = new Flower(FlowerType.TULIP);

        flower1.setPrice(5);
        flower2.setPrice(5);
        flower3.setPrice(5);

        FlowerPack flow_pack1 = new FlowerPack(flower1, 3);
        FlowerPack flow_pack2 = new FlowerPack(flower2, 3);
        FlowerPack flow_pack3 = new FlowerPack(flower3, 3);

        FlowerBucket buck = new FlowerBucket();


        buck.addFlowerPack(flow_pack1);
        buck.addFlowerPack(flow_pack2);
        buck.addFlowerPack(flow_pack3);

        Flower fl = new Flower(FlowerType.ROSE);

        FlowerStore shop = new FlowerStore();

        shop.flowerBuckets.add(buck);

        System.out.println(shop.flowerBuckets.get(0).getPrice());

        System.out.println(shop.search(fl.getFlowerType(), 1000).toString());


    }

}