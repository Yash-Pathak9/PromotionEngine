package Promotion;

import java.util.HashMap;

public class Promotions {
    private HashMap<String,Integer> promotionEntities;
    private int promotionprice;


    public HashMap<String, Integer> getPromotionEntities() {
        return promotionEntities;
    }

    public void setPromotionEntities(HashMap<String, Integer> promotionEntities) {
        this.promotionEntities = promotionEntities;
    }

    public int getPromotionprice() {
        return promotionprice;
    }

    public void setPromotionprice(int promotionprice) {
        this.promotionprice = promotionprice;
    }
}
