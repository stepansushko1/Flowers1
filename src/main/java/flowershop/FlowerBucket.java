package flowershop;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class FlowerBucket {
    public List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addFlowerPack(FlowerPack flower_pack) {
        flowerPacks.add(flower_pack);
    }

    public double getPrice() {
        double bucket_price = 0;
        for(int i = 0; i < flowerPacks.size(); i++){
            bucket_price += flowerPacks.get(i).getPrice();
        }
        return bucket_price;
    }

    public int getNumOfPacks(){
        return flowerPacks.size();
    }

}