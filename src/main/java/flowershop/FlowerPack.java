package flowershop;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower fl, int amount) {
        setFlower(fl);
        setAmount(amount);
    }

    public FlowerType getFlowerType() {
        return this.flower.getFlowerType();
    }

    public boolean hasFlower() {
        return amount >= 1;
    }

    public double getPrice(){
        return flower.getPrice() * amount;
    }

}