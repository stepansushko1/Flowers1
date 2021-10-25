package flowershop;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {

    public List<FlowerBucket> flowerBuckets = new ArrayList<>();
    public List<FlowerBucket> availableBuckets = new ArrayList<>();

    public List<FlowerBucket> search(FlowerType fltp, double wanted_price) {
        System.out.println(fltp);
        for(int i = 0; i<flowerBuckets.size(); i++){

            if(flowerBuckets.get(i).getPrice() <= wanted_price){
                for(int j = 0; j < flowerBuckets.get(i).getNumOfPacks(); j++){
                    if(fltp == flowerBuckets.get(i).flowerPacks.get(j).getFlower().getFlowerType()){
                        availableBuckets.add(flowerBuckets.get(i));

                    }
                }
            }
        }

        if(availableBuckets.size() == 0){
            System.out.println("There is no bucket for your order!");
        }

        return availableBuckets;
    }
}
